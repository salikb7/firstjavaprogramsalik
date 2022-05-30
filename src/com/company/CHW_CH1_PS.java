package com.company;

import java.util.Scanner;

public class CHW_CH1_PS {
    public static void main(String[] args) {
        // Question1 write a program to sum three number in java
        int a = 4;
        int b = 6;
        int c = 10;
        int sum = a+b+c;
        System.out.println(sum);

        // Question2 write a program to calculate CGPA using marks of these subjects (out of 100)
//        float math = 78;
//        float science = 90;
//        float english = 94;
//        float social = 78;
//        float cgpa = (math+science+english+social)/30;
//        System.out.println(cgpa);


        // Question3 write a java program which asks the user to enter his/her name and greets them with "hello<name>, have a good day" text
//        System.out.println("what is your name");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("hello " +name+ ", have a good day!");


        // Question4 write a java program to convert kilometers to miles

        // Question5 write a java program to detect whether a number entered by the user is integer or not
        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());

    }
}
