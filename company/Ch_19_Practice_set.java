package com.company;
import java.util.Scanner;
public class Ch_19_Practice_set {
    public static void main(String[] args) {
        // Question 2:

 //         Scanner sc= new Scanner(System.in);
//        System.out.println("Enter marks in phy");
//        int s1=sc.nextInt();
//        System.out.println("Enter marks in chem");
//        int s2=sc.nextInt();
//        System.out.println("Enter marks in maths");
//        int s3=sc.nextInt();
//
//        float avg=(s1+s2+s3)/3.0f;
//        float per=(s1+s2+s3)/300.0f*100;
//        System.out.println("Your % is : ");
//        System.out.println(per);
//        if (avg>40 && s1>33 && s2>33 && s3>33 )  // never put ; after if statement
//        {
//            System.out.println("U are succesfully Passed Your Examination");
//        }
//        else{
//            System.out.println("U are failed in Examination");
//        }



        // Question 3 :>

//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter your Income");
//        int income =sc.nextInt();
//        float tax=0;
//
//        if(income<250000){
//            tax=tax+0;
//            System.out.println("No Tax is imposed on sal");
//            System.out.println("Salary After deducting the tax");
//            System.out.println(income);
//        }
//        else if(income>250000 && income<=500000){
//            float Salary_Inhand=income-(5.0f/100)*income;
//            tax=(5.0f/100)*income;
//            System.out.println("Tax to be paid is amount of ");
//            System.out.println(tax);
//            System.out.println("Salary After deducting the tax");
//            System.out.println(Salary_Inhand);
//        }
//        else if(income>500000 && income<=1000000){
//            float Salary_Inhand=income-(20.0f/100)*income;
//            tax=(20.0f/100)*income;
//            System.out.println("Tax to be paid is amount of ");
//            System.out.println(tax);
//            System.out.println("Salary After deducting the tax");
//            System.out.println(Salary_Inhand);
//        }
//        else {
//            float Salary_Inhand=income-(30.0f/100)*income;
//            tax=(20.0f/100)*income;
//            System.out.println("Tax to be paid is amount of ");
//            System.out.println(tax);
//            System.out.println("Salary After deducting the tax");
//            System.out.println(Salary_Inhand);
//        }




        // Question 4:
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the day no:");
//        int day=sc.nextInt();
//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Sat");
//            case 7 -> System.out.println("Sunday");

//    }



        // Question 6:

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the website");
        String web =sc.next();

        if(web.endsWith(".org")){
            System.out.println("It is an organization website");
        }
        else if (web.endsWith(".com")){
            System.out.println("It is an organization website");
        }
        else{
            System.out.println("It is an Indian website");
        }


    }
}
