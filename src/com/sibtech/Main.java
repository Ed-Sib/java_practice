package com.sibtech;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        int age;
        int newAge;

        System.out.print("Enter your age: ");
        age = keyboard.nextInt();
        newAge = age + 5;

        System.out.println("In five years time, you will be " + newAge);
    }
}
