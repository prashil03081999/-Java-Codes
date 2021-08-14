package com.company;
class monkey{
    void jump() {
        System.out.println("Monkey Jump");
    }
    void bite(){
        System.out.println("Monkey bite");
    }

}
interface basicAnimal{
    public void eat();
    public void sleep();
}
class human extends monkey implements basicAnimal{
    @Override
    public void eat() {
        System.out.println("Monkey is Eating");
    }
    @Override
    public void sleep() {
        System.out.println("Monkey is sleeping");
    }
    public void speak() {
        System.out.println("human can speak");
    }
}

public class Ch_60_Ps2 {
    public static void main(String[] args) {
        human hm =new human();
        hm.eat();
        hm.bite();

    }
}
