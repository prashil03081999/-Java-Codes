package com.company;

public class Ch_35_Ps6 {
    static int value(int n, int m, int o){
        int sum=0;
      sum= (n+m+o)/3;
      return sum;
    }
    public static void main(String[] args) {
        int avg= value(25,50,75);
        System.out.println(avg);

    }
}
