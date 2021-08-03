package com.company;

public class Ch_35_Ps4 {

        static void pattern(int n){
            for(int i=1;i<=4;i++){
                for(int j=4;j>=i;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
            pattern(4);
    }
}
