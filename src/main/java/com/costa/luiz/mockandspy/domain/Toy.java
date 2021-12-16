package com.costa.luiz.mockandspy.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.ZonedDateTime;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class Toy {

    private String id;
    private String recommendAge;
    private String commercialName;
    private ZonedDateTime releaseDate;
}
