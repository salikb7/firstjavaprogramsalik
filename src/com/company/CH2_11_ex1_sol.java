package com.company;
import java.util.Scanner;

public class CH2_11_ex1_sol {

    public static void main(String[] args) {


        // write above before writing below
        float total = 0;
        System.out.println("Welcome to the CBSE percentage maker");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total marks of the subject ( Eg-100, 80):");
        int total_marks = input.nextInt();
        System.out.println("Enter marks of subject 1:");
        float s1 = input.nextFloat();
        total = total + s1;
        System.out.println("Enter marks of subject 2:");
        float s2 = input.nextFloat();
        total = total + s2;
        System.out.println("Enter marks of subject 3:");
        float s3 = input.nextFloat();
        total = total + s3;
        System.out.println("Enter marks of subject 4:");
        float s4 = input.nextFloat();
        total = total + s4;
        System.out.println("Enter marks of subject 5:");
        float s5 = input.nextFloat()
                ;
        total = total + s5;
        float GrandTotal = total * 100 / (total_marks*5);
        System.out.println("Your total Percentage = " + GrandTotal + "percent");
        System.out.println("Made by me/ Salik Ram Bhandari");


    }

}

