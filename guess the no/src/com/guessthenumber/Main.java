package com.guessthenumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// initialize scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
// declare variables;
        int given_number, random_no = (int) (Math.random() * 20);
//Input for given_no;
        System.out.println("Guess the No between 0-20");
        given_number = sc.nextInt();
//Logic to print right output
        if (random_no == given_number)
            System.out.println("Great,You Guess the right no");
        else if (random_no < given_number || given_number > 20)
            System.out.println("Guess a smaller no");
        else
            System.out.println("Guess a larger no");


    }
}