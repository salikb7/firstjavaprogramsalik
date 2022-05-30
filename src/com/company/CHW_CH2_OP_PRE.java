package com.company;

public class CHW_CH2_OP_PRE {
    public static void main(String[] args) {
        int a = 6 * 5 - 34 / 2;
        System.out.println(a);
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
        30-34/2
        30-17
        =13
         */
//        int b = 6/5-34*2;
//        System.out.println(b);
//        /*
//         12-34*2
//         12-68
//         =-56
//        */
//        // Precedence & Associativity
//        // question1 x-y/2
//        int x = 6;
//        int y = 2;
//        int k = (x-y)/2;
//        System.out.println(k);
//        // Question2 (b*b-4ac)/2a
//        int a = 5;
//        int b = 1;
//        int c = 4;
//        int k = (b*b)-(4*a*c)/(2*a);
//        System.out.println(k);
//        // Question3 (v*v-u*u)
//        int v = 6;
//        int u = 4;
//        System.out.println(((v * v) - (u * u)));
//        Question5 a*b-d
//        int a = 6;
//        int b = 2;
//        int d = 4;
//        System.out.println(a*b-d);

    }
}
