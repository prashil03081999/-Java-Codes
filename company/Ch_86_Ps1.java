package com.company;

public class Ch_86_Ps1 {
    public static void main(String[] args) {
        try{
            int a=999/0;
            System.out.println(a);
        }
        catch (IllegalArgumentException e){
            System.out.println("hehehe");
        }
        catch (ArithmeticException e){
            System.out.println("hahaah");
        }
    }
}
