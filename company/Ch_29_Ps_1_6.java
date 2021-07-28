package com.company;

public class Ch_29_Ps_1_6 {
    public static void main(String[] args) {
        // Question 6: Find the greatest element in the array:

        int arr[]={1,6,-346,55,-77,34};
        int max=Integer.MIN_VALUE;
        for(int element:arr){
            if(element>max){
                max=element;
            }
        }
        System.out.println(max);

//
//        int min=Integer.MAX_VALUE;
//        int arr[]={29,45,66,-432,565,56,23};
//        for (int element:arr){
//            if (element<min){
//                min=element;
//            }
//        }
//        System.out.println(min);
    }
}
