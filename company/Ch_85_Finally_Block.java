package com.company;

public class Ch_85_Finally_Block {
    public static void main(String[] args) {
        try{
            int a=50;
            int b=5;
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This program is over now..");
        }
    }
}
