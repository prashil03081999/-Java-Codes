package com.company;
import java.util.Scanner;
//In java string is class and string has special support in java.
//strings are immuatble and cannot be chnged.
public class Ch_13_Strings {
    public static void main(String[] args) {



       // String str=new String("Prashil is a bad boy");
       /* String name="Prashil is a good boy"; // both methods for forming the strings are right.
        System.out.println(name);
        */



       /* int a =10;
        float b = 12.5555f;
        System.out.printf("The value of a is %d and value of b is %f ",a,b);     // look closely I have used
        // printf not println and interesting thing is that both printf and format work similar
        System.out.format("The value of a is %d and value of b is %0.2f ",a,b);
        //0.2 will give 2 decimal places
        //8.2f will leave space and at 8 sace it will complete the ans
        */




        // We can take string from User.
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string:");
        //String str=sc.next(); // this will take only first word of string to resolve this use nextline()
        String str =sc.nextLine();
        System.out.println(str);


    }
}
