package com.company;

public class Ch_33_VarArgs_multiplication {
    static int mul(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }return result;
    }
    public static void main(String[] args) {
        System.out.println("multiplication of 2,4,7 is:" + mul(2,4,7));
        System.out.println("multiplication of 2,4,7,8 is:" + mul(2,4,7,8));
        System.out.println("multiplication of 2,4,7,8,9is:" + mul(2,4,7,8,9));

    }
}
