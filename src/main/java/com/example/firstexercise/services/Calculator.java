package com.example.firstexercise.services;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calculator {

    public boolean isItFriday(){
        LocalDate ld = LocalDate.now();

        DayOfWeek dayOfWeek = DayOfWeek.from(ld);
        int val = dayOfWeek.getValue();
        if(val == 5){
            return true;
        } else return false;
    }



}
