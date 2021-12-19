package com.costa.luiz.mockandspy.domain;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Optional;

@RequiredArgsConstructor
public class ToyService {

    private final ToyValidator validator;
    private final ToyRepository repository;

    public Toy save(Toy toy) {
        validator.validateName(toy.getCommercialName() );
        return repository.save(toy);
    }

    public Optional<Toy> findById(String id) {
        validator.validateId(id);
        return Optional.of(Toy.builder()
                .id("42")
                .commercialName("Buzz Lightyear")
                .releaseDate(ZonedDateTime.of(LocalDateTime
                        .of(
                                LocalDate.of(1995, Month.NOVEMBER, 19),
                                LocalTime.of(19, 0, 0)), ZoneId.of("Americas/Sao_Paulo")))
                .build());
    }

    public void delete(String id) {
        throw new UnsupportedOperationException();
    }

}
