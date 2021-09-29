package com.tmam.springtmam.model;

import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;

public class NextBirthday extends Info {
    @Getter
    private final String name;
    private final String argument;

    public NextBirthday(String argument) {
        this.argument = argument;
        this.name = "Your next birthday is after: ";
    }

    @Override
    public String getValue() {
        LocalDate today = LocalDate.now();
        LocalDate date = getLocalDate(this.argument);
        LocalDate nextBirthday = LocalDate.of(today.getYear() + 1, date.getMonth(), date.getDayOfMonth());
        Period period = Period.between(today, nextBirthday);
        return period.getYears()
                + " years " + period.getMonths()
                + " months " + period.getDays()
                + " days ";
    }
}
