package com.company;


public class Ch_80_TryBlock {
    public static void main(String[] args) {
        int a =15;
        int b=0;
        int c;

        try {
            c=a/b;
            System.out.println("Print the value of c:"+c );
        } catch (Exception e) {
            System.out.println("the expression failed to print and the reason is:");
            System.out.println(e);
        }

    }
}
