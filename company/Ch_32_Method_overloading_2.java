package com.company;

public class Ch_32_Method_overloading_2 {
    static void foo(){
        System.out.println("Hii bro How are you?");
    }
    static void foo(int a) //a is parameter this is not an argument
    {
        System.out.println(" hii bro how are u "+ a +".");
    }
    static void foo(int a, int b){
        System.out.println("hii " + a + " how " + b +".");

    }


    public static void main(String[] args) {
        foo();
        foo(2000); // 2000 is argument this is not a parameter.
        foo(200,599);
    }
}
