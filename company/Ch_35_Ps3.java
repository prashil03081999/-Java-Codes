package com.company;

import jdk.dynalink.beans.StaticClass;

public class Ch_35_Ps3 {
    static int RecSum(int n){
        if(n==1){
            return 1;
        }
        return n + RecSum(n-1);
    }
    public static void main(String[] args) {
        int p=RecSum(3);
        System.out.println(p);
    }
}
