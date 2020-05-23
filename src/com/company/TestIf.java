package com.company;

public class TestIf {


    //psvm
    public static void main(String[] args) {
        // create check of temperature if temp is higher then 80.1 print hot
        double temperature = 80.1;
        if (temperature >= 80.1) {
            System.out.println("Hot!");
        } else {
            System.out.println("Ok!");

        }

        System.out.println("----------------------------------------");

        // Create if else if() where temp more then 80.1 print (Hot)
        // from 75 to 80 print "Just right!"
        // less then 75 "Cold"

        double tempTest = 80.2;

        if (tempTest > 80.1) {
            System.out.println("Hot!");
        } else if (tempTest >= 75.0) {
            System.out.println("Just right!");
        } else {
            System.out.println("Cold!");
        }
    }
}
