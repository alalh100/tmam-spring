package com.tmam.springtmam.model;

import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;

public class Age extends Info {
    @Getter
    private final String name;
    private final String argument;

    public Age(final String argument) {
        this.name = "Your age is: ";
        this.argument = argument;
    }

    @Override
    public final String getValue() {
        LocalDate localDate = getLocalDate(this.argument);
        LocalDate today = LocalDate.now();
        Period period = Period.between(localDate, today);

        return period.getYears()
                + " years " + period.getMonths()
                + " months " + period.getDays()
                + " days ";
    }

//    private LocalDate getLocalDate(final String birthday)
//            throws ParseException {
//        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//        Date date = formatter.parse(birthday);
//        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//    }
}
