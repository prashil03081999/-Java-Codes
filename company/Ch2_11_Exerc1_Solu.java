package com.company;
import java.util.Scanner;
public class Ch2_11_Exerc1_Solu {
    public static void main(String[] args) {
        Scanner per=new Scanner(System.in);
        System.out.println("Enter marks of subj1");
        float s1 = per.nextFloat();
        System.out.println("Enter marks of subj2");
        float s2 = per.nextFloat();
        System.out.println("Enter marks of subj3");
        float s3 = per.nextFloat();
        System.out.println("Enter marks of subj4");
        float s4 = per.nextFloat();
        System.out.println("Enter marks of 5");
        float s5 = per.nextFloat();
        float Per =(s1+s2+s3+s4+s5)/500*100;
        System.out.println("Final Percentage is :{Per}%");
        System.out.println(Per);

    }
}
