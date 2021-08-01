package com.company;
// Question 1 writting table using method:

public class Ch_35_Ps1 {

    static void table(int n){
        for(int i=1;i<11;i++){
            System.out.format("%d x %d=%d\n",n,i,n*i);
        }


    }
    public static void main(String[] args) {
       table(6);


    }
}
