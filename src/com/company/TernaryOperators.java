package com.company;

public class TernaryOperators {

    public static void main(String[] args) {

        int time = 22;

        if(time < 18){
            System.out.println("Good day.");
        }else{
            System.out.println("Good evening.");
        }
        System.out.println("---------------------------------");
        boolean result = (time < 18) ? false : true;

        System.out.println(result);


    }

}
