package com.company;

public class Ch_31_Methods {
//    static int logic (int x,int y){
//        int z;
//        if (x<y){
//            z=x+y;
//        }
//        else{
//            z=x*y;
//        }
//        return z;
//
//
//    }
//    public static void main(String[] args) {
//        int a=10;
//        int b=4;
//        int c;
//        c=logic(a,b);
//        int a1=2;
//        int b1=9;
//        int c1;
//        c1=logic(a1,b1);
//        System.out.println(c);
//        System.out.println(c1);



    static int check(int x, int y) {
        int z;
        if (x < y) {
            z = (x * y) + x;
        } else {
            z = x + y;

        }
        return z;
    }
        public static void main(String[] args) {
            int a1 = 10;
            int b1 = 12;
            int c1;
            c1 = check(a1,b1);
            System.out.println(c1);


        }
    }


