package com.costa.luiz.mockandspy.domain;

import java.util.regex.Pattern;

import static java.util.Objects.isNull;

public class ToyValidator {

    public void validateId(String id) {
        if (isNull(id)) {
            throw new IllegalArgumentException();
        }
    }

    public void validateName(String name) {
        if (!Pattern.compile("^[\\p{L} .'-]+$").matcher(name).find()) {
            throw new IllegalArgumentException("Invalid name, please try again");
        }
    }
}
