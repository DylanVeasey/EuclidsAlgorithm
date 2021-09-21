package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int firstInteger, secondInteger, greatestCommonDivisor;

	    firstInteger = getUserInput("first");

        secondInteger = getUserInput("second");

        //If the first integer value is lower than the second, then swap the values of the first and second integer so that the first integer is always larger
        if( firstInteger < secondInteger){
           firstInteger = firstInteger + secondInteger;
           secondInteger = firstInteger - secondInteger;
           firstInteger = firstInteger - secondInteger;
        }

        greatestCommonDivisor = gcd(firstInteger, secondInteger);

        System.out.println(greatestCommonDivisor);
    }

    public static int gcd(int firstInteger, int secondInteger){
        if (secondInteger == 0) {
            return firstInteger;
        }
        else{
            return (gcd(secondInteger, firstInteger % secondInteger));
        }
    }

    public static int getUserInput(String number){
        Scanner scanner = new Scanner(System.in);
        int userInteger;

        System.out.print("Enter the " + number + " integer:");
        //Validates the user's input to ensure that it is an integer
        try {
            userInteger = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Please enter an integer!");
            userInteger = getUserInput(number);
        }

        return userInteger;
    }






}
