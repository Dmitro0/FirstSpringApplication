package com.example.entities;

import org.springframework.stereotype.Component;

public class Bobik {
    private String name = "Бобик";

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
