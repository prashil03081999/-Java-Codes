package com.company;

public class Ch_35_Ps5 {
    static int fib (int n){
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        //fibonaci series:0,1,1,2,3,5,8,12
        int result=fib(5);
        System.out.println(result);

    }
}
