package com.company;

public class palindrome {
    public static void main(String[] args) {
        String s="mom";
        String rev="";

        for (int i =s.length()-1; i>=0; i--) {
            rev= rev + s.charAt(i);
        }
        if (s.equalsIgnoreCase(rev)){
            System.out.println("this is palindrome number");
        }
        else{
            System.out.println("this is not palindrome number");
        }
    }
}
