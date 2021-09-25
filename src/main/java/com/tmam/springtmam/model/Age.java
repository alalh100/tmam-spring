package com.tmam.springtmam.model;

import lombok.Getter;
import lombok.Setter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@Getter
@Setter
public class Age extends Info {
    private final String name = "Your age is: ";
    private final String argument;

    public Age(String argument) {
        this.argument = argument;
    }

    @Override
    public String getValue() {
        LocalDate localDate = null;
        try {
            localDate = getLocalDate(this.argument);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        LocalDate today = LocalDate.now();
        Period period = Period.between(localDate, today);

        return period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days ";
    }

    private LocalDate getLocalDate(String birthday) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = formatter.parse(birthday);
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
