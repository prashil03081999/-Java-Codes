package com.company;
class Tom{
    public void hitting(){
        System.out.println("hitting the enemy");
    }
    public void Fire(){
        System.out.println("fire the enemy");
    }
    public void running(){
        System.out.println("running from the spot");
    }
}

public class Ch_39_Ps5 {
    public static void main(String[] args) {
        Tom characters= new Tom();
        characters.hitting();
        characters.Fire();
        characters.running();


    }
}
