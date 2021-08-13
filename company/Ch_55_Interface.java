package com.company;
interface bicycle{
    int a=14;
    void applyBrake(int decrement);
    void speedUp(int Increment);
}
interface Car{
    void changeGear();
    void handleSteering();

}
class AvonCycle implements bicycle,Car{
    void blowHorn(){
        System.out.println("pee ");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brakes");
    }
    public void speedUp(int Increment){
        System.out.println("Applying accelerator");
    }
    public void changeGear(){
        System.out.println("Shifting gears");
    }
    public void handleSteering(){
        System.out.println("revolving the steering");
    }
}

public class Ch_55_Interface {
    public static void main(String[] args) {
        AvonCycle cyl=new AvonCycle();
        cyl.applyBrake(1);
        cyl.changeGear();
        //.out.println(cyl.a);
        // cyl.a=45;  // you cannot modify the value of interface in main method
    }
}
