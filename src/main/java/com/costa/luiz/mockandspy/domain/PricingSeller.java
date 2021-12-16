package com.costa.luiz.mockandspy.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class PricingSeller {

    private String id;
    private String name;
}
