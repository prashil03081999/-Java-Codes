package com.company;
class ps3a extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }

    }
}
class ps3b extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }

    }
}

public class Ch_76_PS3 {
    public static void main(String[] args) {
        ps1 v1 =new ps1();
        ps1b v2= new ps1b();
        v1.setPriority(5);
        v2.setPriority(9);
        System.out.println(v1.getPriority());
        System.out.println(v2.getPriority());
        v1.start();
        v2.start();
    }
}
