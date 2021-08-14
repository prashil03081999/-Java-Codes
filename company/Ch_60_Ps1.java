package com.company;
abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainPen extends pen{
    public void changeNib(){
        System.out.println("Change the nib");
    }
    @Override
    void write() {
        System.out.println("write");
    }
    @Override
    void refill() {
        System.out.println("Refill");
    }
}

public class Ch_60_Ps1 {
    public static void main(String[] args) {
        fountainPen fp =new fountainPen();
        fp.changeNib();

    }
}
