package com.company;
class Myth extends Thread{
    public Myth(String name){
        super(name);
        }
    public void run(){
        while(true){
            System.out.println("I am thread");
            break;
        }
    }
}

public class Ch_73_Thread_Constructor {
    public static void main(String[] args) {
        Myth mt1= new Myth("Pr");
        Myth mt2= new Myth("Ram");
        mt1.start();
        mt2.start();
        System.out.println("The id of the thread is "+ mt1.getId());
        System.out.println("The id of the thread is "+ mt2.getId());
        System.out.println("The name of the thread is "+mt1.getName());
        System.out.println("The name of the thread is "+mt2.getName());


    }
}
