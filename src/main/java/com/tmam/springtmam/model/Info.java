package com.tmam.springtmam.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Info {
    private String name;

    public String getValue() {
        return " ";
    }
}
