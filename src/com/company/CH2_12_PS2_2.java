package com.company;

public class CH2_12_PS2_2 {
    public static void main(String[] args) {
      // Write a java program to encrypt a garde by adding 8 to it. decrypt it to show the correct grade
        char grade = 'b';
        grade = (char)(grade+8);
        System.out.println(grade);

        // decrypting the grade
        grade = (char)(grade-8);
        System.out.println(grade);
    }
}
