package com.company;

public class Ch_29_Practice_Set {
    public static void main(String[] args) {
        // Question 1: float array of 5 and their sum
        float sum=0;
        float [] marks={100,200,400,700,1400};
        for(float retrieve:marks){
            System.out.println(retrieve);
            sum=sum+retrieve;
        }
        System.out.print("sum of elements in array is: ");
        System.out.print(sum);
    }
    }

