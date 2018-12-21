package com.sibtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dayOfWeek;

        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter day number: ");
        //dayOfWeek = input.nextInt();

        int[] daysOfWeek = {1,2,3,4,5,6,7};

        for (int day : daysOfWeek) {
            System.out.println("Today is a " + Day(day) + "!");
        }

    }

    public static String Day(int dayOfWeek) {
        String weekday;
        if (dayOfWeek >= 1 && dayOfWeek <= 7) {
            switch (dayOfWeek) {
                case 1:
                    weekday = "Monday";
                    break;
                case 2:
                    weekday = "Tuesday";
                    break;
                case 3:
                    weekday = "Wednesday";
                    break;
                case 4:
                    weekday = "Thursday";
                    break;
                case 5:
                    weekday = "Friday";
                    break;
                case 6:
                    weekday = "Saturday";
                    break;
                case 7:
                    weekday = "Sunday";
                    break;
                default:
                    weekday = "error";
                    break;
            }
            return weekday;
        } else {
            return "error";
        }
    }
}
