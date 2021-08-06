package com.company;
class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }

}

public class Ch_39_Ps4 {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        rec.length=10;
        rec.breadth=15;
        System.out.println("the area of Rectangle is:"+ rec.area());

    }
}
