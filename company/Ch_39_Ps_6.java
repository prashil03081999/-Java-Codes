package com.company;
class Circle{
    float r;
    public double area(){
        return 2*3.14*r;
    }
}

public class Ch_39_Ps_6 {
    public static void main(String[] args) {
        Circle cir=new Circle();
        cir.r=23.0f;
        System.out.println("The area of the Circle is:"+cir.area());

    }
}
