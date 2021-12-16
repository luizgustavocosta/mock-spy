package com.costa.luiz.mockandspy.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class Manufacturer {

    private String id;
    private Address address;
    private String name;
    private String commercialName;
    private List<Toy> toys;
}
