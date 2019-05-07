package com.example.demo.model;

import lombok.Data;

@Data
public class Base {
    private String num;

    private String size;

    @Override
    public String toString() {
        return "Base{" +
                "num='" + num + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
