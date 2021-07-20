package com.company;
import java.util.Scanner;

public class Ch2_12_Practice_Set {
    public static void main(String[] args) {
     /*    question 1
        float a=7/4*9/2; // we r going to get wrng value cause it wiil treat
        // expresion as int to resolve this we have to do like this.
        float a=7/4f*9/2f;
        float a=7f/4*9f/2;//abve nd this both expresn r right just put f in num or deno u will get expected value.

        System.out.println(a);  */


        //Question2 encrypt the grade add 8 while decryting subtrct 8
        // encrypted
       /* char grade= 'b';
        System.out.println("Encryted Grade");
        // it will not going to work like this char +int to resolve it

        grade= (char)(grade+8);
        System.out.println(grade);
        //decryting
        System.out.println("Decryted Grade");
        grade=(char)(grade-8);
        System.out.println(grade);

        */



       // Question 3

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value to compare");
        int a = sc.nextInt();
        System.out.println(a<8);






    }
}
