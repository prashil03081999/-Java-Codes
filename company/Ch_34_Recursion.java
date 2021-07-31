package com.company;

public class Ch_34_Recursion {
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println("factorial of 5 is: " +fact(x)+".");


    }
}
