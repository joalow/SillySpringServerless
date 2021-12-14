package com.dailycodebuffer.spring.function;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class ToLowerCase{


    public String apply(String s) {
        return s + " , has pasado por aqui!!";
       // return new StringBuilder(s).toString().toLowerCase();
    }
}
//