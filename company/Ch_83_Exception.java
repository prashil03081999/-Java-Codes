package com.company;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "To get String";
    }
    public String getMessage(){
        return "getting the Message";
    }
}

public class Ch_83_Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes Finished");
        }

    }
}
