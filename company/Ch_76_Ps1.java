package com.company;
class ps1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }

    }
}
class ps1b extends Thread{
    public void run(){
        while(true){
            System.out.println("Welcome");
        }

    }
}

public class Ch_76_Ps1 {
    public static void main(String[] args) {
        ps1 item =new ps1();
        ps1b items= new ps1b();
        item.start();
        items.start();
    }
}
