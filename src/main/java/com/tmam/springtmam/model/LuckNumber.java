package com.tmam.springtmam.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LuckNumber extends Info {
    private final String name = "Your lucky number is: ";
    private final String argument;

    public LuckNumber(String argument) {
        this.argument = argument;
    }

    @Override
    public String getValue() {
        int sum = 0;
        for (int i = 0; i < this.argument.length(); i++) {
            int asciiValue = this.argument.charAt(i);
            sum = sum + asciiValue;
        }
        return Integer.toString(sum);
    }
}
