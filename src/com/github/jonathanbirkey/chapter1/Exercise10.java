package com.github.jonathanbirkey.chapter1;

public class Exercise10 {
    public static void main(String[] args){
        double avg_kph = 14 / ((45.0 * 60.0 + 30.0) / (60.0 * 60.0));
        double avg_mph = avg_kph / 1.6;
        System.out.printf("%f\n", avg_mph);
    }
}
