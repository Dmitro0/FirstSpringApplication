package com.example.entities;

import org.springframework.stereotype.Component;

public class Dog {
    private String name = "Собачка";

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
