package com.company;
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int peri(){
        return 4*side;
    }
}

public class Ch_39_Ps3 {
    public static void main(String[] args) {
        Square sq=new Square();
         sq.side=3;
        System.out.println("The Area of the Square is:"+ sq.area());
        System.out.println("The perimter of the Square is:"+ sq.peri());
    }
}
