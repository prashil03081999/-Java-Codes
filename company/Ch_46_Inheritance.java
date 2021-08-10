package com.company;
class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base class and  changing the  value of x");
        this.x = x;
    }
}
class derive extends base{          // to acces the base classs in derive write extends children_class_name
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in derived class and  changing the  value of y");
        this.y = y;
    }
}

public class Ch_46_Inheritance {
    public static void main(String[] args) {
        // creating an object for the base class
        base b =new base();
        b.setX(4);
        System.out.println(b.getX());

        // creating an object for the derived class
        derive b1 =new derive();
        b1.setX(54);
        System.out.println(b1.getX());

        derive d =new derive();
        d.setY(45);
        System.out.println(d.getY());

    }
}
