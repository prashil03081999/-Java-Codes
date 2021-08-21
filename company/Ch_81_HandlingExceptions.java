package com.company;

import java.util.Scanner;

public class Ch_81_HandlingExceptions {
    public static void main(String[] args) {
        int [] mark={23,45,67};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index number:");
        int ind=sc.nextInt();


        System.out.println("Enter the number you want to divide with");
        int num=sc.nextInt();
        try{
            System.out.println("The array index="+mark[ind]);
            System.out.println("The array array-value/num= "+mark[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }

    }
}
