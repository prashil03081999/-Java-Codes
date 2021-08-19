package com.company;
class MT implements Runnable{

    @Override
    public void run() {
        int i=0;
        while(i<40){
            System.out.println("Iam thread 1 Not threat");
            i++;
        }
    }
}
class Mt extends Thread{
    public Mt(Runnable r, String name){
        super(name);
    }

    public Mt(int i, String ram) {
    }

    public class Ch_73_Partb {
    public static void main(String[] args) {
        MT MT1 =new MT();
        Thread t1=new Thread(MT1);
        Mt MT2=new Mt(6,
                "ram");


    }

    }
}
