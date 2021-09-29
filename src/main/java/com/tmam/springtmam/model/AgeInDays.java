package com.tmam.springtmam.model;

import lombok.Getter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeInDays extends Info {
    @Getter
    private final String name;
    private final String argument;

    public AgeInDays(String argument) {
        this.argument = argument;
        this.name = "You are: ";
    }

    @Override
    public String getValue() {
        LocalDate today = LocalDate.now();
        LocalDate localDate = getLocalDate(this.argument);
        return ChronoUnit.DAYS.between(localDate, today) + " days old";
    }
}
