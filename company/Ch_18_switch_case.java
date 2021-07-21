package com.company;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ch_18_switch_case {
    public static void main(String[] args) {
        System.out.println("Enter the age:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a){
            case 18:
                System.out.println("U are mature enough");
                break;
            case 23:
                System.out.println("U are going to do a job");
                break;
            case 60:
                System.out.println("U r going to be retired at the age of 60");
                break;
            default:
                System.out.println("enjoy your life");

        }

        // or or  or or
        // when u put cursor on switch it will show to convert in enhanced switch after that your program
        // will look like this this is gift from intelli j id only

        // below switch known as enhanced switch and imp point is that enhanced switch doesnot require break:
        switch (a) {
            case 18 -> System.out.println("U are mature enough");
            case 23 -> System.out.println("U are going to do a job");
            case 60 -> System.out.println("U r going to be retired at the age of 60");
            default -> System.out.println("enjoy your life");
        }

    }
}