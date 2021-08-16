package com.company;
abstract class telePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smart_telephone extends telePhone{
    void playMusic(){
        System.out.println("Smart telephone can play music");
    }
    void playGames(){
        System.out.println("Smart telephone support games");
    }
    @Override
    void ring() {
        System.out.println("Telephone is ringing");
    }
    @Override
    void lift() {
        System.out.println("Telephone is lifted");
    }
    @Override
    void disconnect() {
        System.out.println("Telephone is disconnected");
    }
}

public class Ch_60_Ps3 {
    public static void main(String[] args) {
        telePhone tp= new Smart_telephone();
        tp.disconnect();
        tp.lift();
        tp.ring();


    }
}
