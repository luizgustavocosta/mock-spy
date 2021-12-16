package com.costa.luiz.mockandspy.domain;

import lombok.RequiredArgsConstructor;

import java.time.*;
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

}
