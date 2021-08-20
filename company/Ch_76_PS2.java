package com.company;
class ps2 extends Thread{
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
class ps2b extends Thread{
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

public class Ch_76_PS2 {
    public static void main(String[] args) {
        ps1 item =new ps1();
        ps1b items= new ps1b();
        item.start();
        items.start();
    }
}
