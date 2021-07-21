package com.company;
import java.util.Scanner;

public class Ch_18_Else_IF_ladder {
    public static void main(String[] args) {
        System.out.println("Enter the age:");
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        if (a>54){
            System.out.println("Experienced driver");
        }
        else if(a>46){
            System.out.println("Semi-Experienced");
        }
        else if(a>36){
            System.out.println("semi-semi-Experienced");

        }
        else{
            System.out.println("u r not experinced");
        }

    }
}
