package com.company;
// second method to run thread that is implement method
class MyThreadRunnable1 implements Runnable {
    public void run() {
        int i=0;
        while(i<400){
            System.out.println("Iam thread 1 Not threat");
            i++;
        }

    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("Iam thread 2 Not threat");
            i++;
        }
    }
}

public class Ch_71_Runnable_Interface {
    public static void main(String[] args) {
        MyThreadRunnable1 t1=new MyThreadRunnable1();
        Thread g1= new Thread(t1);
        MyThreadRunnable2 t2=new MyThreadRunnable2();
        Thread g2= new Thread(t2);
        g1.start();
        g2.start();
    }

    }

