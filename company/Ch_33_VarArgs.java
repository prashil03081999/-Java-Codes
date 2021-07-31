package com.company;

public class Ch_33_VarArgs {
//    static int sum(int a, int b){
//    return a+b;
//    }
//    static int sum(int a, int b,int c){
//    return a+b;
//    }

    static int sum (int ...arr){
        int result=0;
        for (int a:arr){
            result+=a;
        }return result;
    }


    public static void main(String[] args) {
        System.out.println("the sum of 4 and 5 is "+ sum(4,5));
        System.out.println("the sum of nothing is "+ sum());
        System.out.println("the sum of 4 ,5 7,8 is "+ sum(4,5,7,8));
        System.out.println("the sum of 4 ,5 7,8,10 is "+ sum(4,5,7,8,10));
        // Now for everytime we are creating new method but to resolve this we have to use VarArgs




    }
}