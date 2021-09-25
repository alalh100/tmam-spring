package com.tmam.springtmam.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LuckNumber extends Info {
    private final String name;
    private final String argument;

    public LuckNumber(final String argument) {
        this.name = "Your lucky number is: ";
        this.argument = argument;
    }

    @Override
    public final String getValue() {
        int sum = 0;
        for (int i = 0; i < this.argument.length(); i++) {
            int asciiValue = this.argument.charAt(i);
            sum = sum + asciiValue;
        }
        return Integer.toString(sum);
    }
}
