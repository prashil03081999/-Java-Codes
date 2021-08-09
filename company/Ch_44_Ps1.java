package com.company;
class cylinder{
    private int radius;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

public class Ch_44_Ps1 {
    public static void main(String[] args) {
        cylinder cyl =new cylinder();
        cyl.setHeight(10);
        int h=cyl.getHeight();
        System.out.println("height of a cylinder is:"+ h);
        cyl.setRadius(5);
        int r=cyl.getRadius();
        System.out.println("radius of cylinder is:"+ r);
        double volume=Math.PI*(r*r)*h;
        System.out.println("Volume of cylinder is :" + volume);
        double surfaceArea=2.*Math.PI*r*(h+r);
        System.out.println("Total Surface Area of Cylinder is:"+surfaceArea);


    }
}
