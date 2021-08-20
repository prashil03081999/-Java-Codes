package com.company;
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<20){
            System.out.println("Iam thread1 "+ this.getName());
        }

    }
}

public class Ch_74_Thread_Priorities {
    public static void main(String[] args) {
        MyThread MT =new MyThread("Pr1");
        MyThread MT1 =new MyThread("Pr2");
        MyThread MT2=new MyThread("Pr3");
        MyThread MT3 =new MyThread("Pr4");
        MyThread MT4 =new MyThread("Pr5");
        MT4.setPriority(Thread.MAX_PRIORITY);
        MT3.setPriority(Thread.MIN_PRIORITY);
        MT2.setPriority(Thread.MIN_PRIORITY);
        MT1.setPriority(Thread.MIN_PRIORITY);
        MT.setPriority(Thread.MIN_PRIORITY);
        MT.start();
        MT1.start();
        MT2.start();
        MT3.start();
        MT4.start();


    }

}
