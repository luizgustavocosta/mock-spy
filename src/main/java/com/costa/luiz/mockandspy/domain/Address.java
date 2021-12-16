package com.costa.luiz.mockandspy.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Builder
@ToString
public class Address {

    private String id;
    private String city;
    private String country;
    private String poBox;
    private String region;
}
