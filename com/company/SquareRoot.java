package com.company;

public class SquareRoot {
//formula 

    public static void main(String[] args) {
        double number = 15;
        double root;
        root = square(number);
        System.out.println("Number : " + number);
        System.out.println("Square Root : " + root);
    }


    public static double square(double number) {
        double t;

        double squareroot = number / 2;

        do {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        } while ((t - squareroot) != 0);

        return squareroot;
    }
}