// CHECKSTYLE:OFF
package com.tmam.springtmam.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public abstract class Info {
    public String getValue() {
        return " ";
    }

    LocalDate getLocalDate(final String birthday) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try {
            date = formatter.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (date != null) {
            return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }
        return LocalDate.now();
    }
}
