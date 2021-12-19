package com.costa.luiz.mockandspy.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@DisplayName("What is the difference between Mock and Spy?")
class ToyServiceTest {

    public static final String ID = "10";
    public static final String COMMERCIAL_NAME = "Rubik's Cube";

    @Test
    @DisplayName("Save using Mock")
    void saveUsingMock() {
        ToyService service = Mockito.mock(ToyService.class);
        Toy toy = Toy.builder().commercialName(COMMERCIAL_NAME).build();

        when(service.save(toy)).thenReturn(Toy.builder().id(ID).build());

        Toy storedToy = service.save(toy);

        verify(service, atLeastOnce()).save(toy);
        assertThat(ID, equalTo(storedToy.getId()));
    }

    @Test
    @DisplayName("Save using Spy")
    void saveUsingSpy() {
        ToyJpa repository = Mockito.mock(ToyJpa.class);
        ToyValidator validator = Mockito.spy(ToyValidator.class);

        Toy toy = Toy.builder().commercialName(COMMERCIAL_NAME).build();
        Toy newToy = Toy.builder().id(ID).commercialName(COMMERCIAL_NAME).build();

        Mockito.doReturn(newToy).when(repository).save(toy);

        ToyService service = Mockito.spy(new ToyService(validator, repository));

        Toy storedToy = service.save(toy);

        verify(service, atLeastOnce()).save(toy);
        verify(validator, atLeastOnce()).validateName(COMMERCIAL_NAME);
        verify(repository, atLeastOnce()).save(toy);

        assertAll("Fine validation",
                () -> assertEquals(ID, storedToy.getId()),
                () -> assertEquals("11", storedToy.getId()),
                () -> assertEquals(COMMERCIAL_NAME, storedToy.getCommercialName()));
    }
}