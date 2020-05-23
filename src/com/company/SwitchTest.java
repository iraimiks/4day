package com.company;

public class SwitchTest {

    public static void main(String[] args) {
        char operators = 'm';
        double number1 = 10.0;
        double number2 = 3.0;
        double result;
        double result2;
        switch(operators){
            case 'm':
                result = number1 + number2;
                result2 = number1 - number2;
                System.out.println("Result sum: "+result);
                System.out.println("Result sub: "+result2);

                break;
            case '-':
                result = number1 - number2;
                System.out.println(result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(result);
                break;
            default:
                System.out.println("No such operator present.");
        }
        char test = 'a'+'d';
        System.out.println(test);
    }
}
