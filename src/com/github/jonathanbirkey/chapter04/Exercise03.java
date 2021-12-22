/**
 * @author : Jonathan Birkey
 * @mailto : jonathan.birkey@gmail.com
 * @created : 22Dec2021
 **/
package com.github.jonathanbirkey.chapter04;

public class Exercise03 {
    public static void main(String[] args) {
        // Atlanta, Georgia
        double x1 = Math.toRadians(33.7489954);
        double y1 = Math.toRadians(-84.3879824);

        // Orlando, Florida
        double x2 = Math.toRadians(28.5383355);
        double y2 = Math.toRadians(-81.3792365);

        // Savannah, Georgia
        double x3 = Math.toRadians(32.0835407);
        double y3 = Math.toRadians(-81.0998342);

        // Charlotte, North Carolina
        double x4 = Math.toRadians(35.2270869);
        double y4 = Math.toRadians(-80.8431267);

        double atlantaToOrlando = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) *
                Math.cos(y1 - y2));
        double orlandoToSavannah = 6371.01 * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) *
                Math.cos(y2 - y3));
        double savannahToCharlotte = 6371.01 * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) *
                Math.cos(y3 - y4));
        double charlotteToAtlanta = 6371.01 * Math.acos(Math.sin(x4) * Math.sin(x1) + Math.cos(x4) * Math.cos(x1) *
                Math.cos(y4 - y1));
        double atlantaToSavannah = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) *
                Math.cos(y1 - y3));

        double area1 = (atlantaToOrlando + orlandoToSavannah + atlantaToSavannah) / 2;
        double area2 = (savannahToCharlotte + charlotteToAtlanta + atlantaToSavannah) / 2;

        System.out.printf("The area between Atlanta, Georgia, Orlando, Florida, Savannah, Georgia, " +
                "and Charlotte, North Carolina is about %f", area1 + area2);
    }
}
