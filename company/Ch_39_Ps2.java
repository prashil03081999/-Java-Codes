package com.company;
class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void calling(){
        System.out.println("Calling  my x ...");
    }

        }

public class Ch_39_Ps2 {
    public static void main(String[] args) {
        CellPhone moto=new CellPhone();
        moto.calling();
        moto.ringing();
        moto.vibrating();
    }
}
