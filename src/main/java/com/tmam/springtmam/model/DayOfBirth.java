package com.tmam.springtmam.model;

import lombok.Getter;

import java.time.LocalDate;

public class DayOfBirth extends Info {
    @Getter
    private final String name;
    private final String argument;

    public DayOfBirth(String argument) {
        this.argument = argument;
        this.name = "You were born at: ";
    }

    @Override
    public String getValue() {
        LocalDate localDate = getLocalDate(argument);
        return localDate.getDayOfWeek().toString();
    }
}
