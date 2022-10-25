package com.guessthenumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// initialize scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");

// declare variables;
        int given_number,i = 5, random_no = (int) (Math.random() * 20);
//Rules for game
        System.out.println("1. Guess the No between 0-20");
        System.out.println("2. Enter only posivite No");
        System.out.println("3. Enter -1 to exit the game");


//Logic to print right output
        while(i!=0) {
            //Input for given_no;
            System.out.println("Enter a Number");
            given_number = sc.nextInt();
            if (random_no == given_number) {
                System.out.println("Great,You Guess the right no");
                break;
            }
            else if (random_no < given_number || given_number > 20)
                System.out.println("Guess a smaller no");
            else if (given_number<0) {
                break;
            } else
                System.out.println("Guess a larger no");
            i--;
            int chance = i-1+1;
            if(chance<=0) {
                System.out.println("OOps!You lose the game");
                System.out.println("The random no is : "+random_no);
                break;
            }
            System.out.println("You have "+chance+" chance left");
        }

    }
}