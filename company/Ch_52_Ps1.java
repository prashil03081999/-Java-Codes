package com.company;
class circle_new{
    public int radius;
    public int height;
    public circle_new(int r){
        System.out.println("Iam parametrized constructor");
        this.radius=r;
    }
    public void area(){
        double area;
        area=Math.PI*this.radius*this.radius;
        System.out.println(area);
    }


}
class cylinder_new extends circle_new{
    cylinder_new(int r, int h) {
        super(r);
        System.out.println("iam constructor of cylinder_new");
        this.height=h;
    }


    public void vol(){
         double vol;
         vol=Math.PI*this.radius*this.radius*this.height;
        System.out.println(vol);
    }

}

public class Ch_52_Ps1 {
    public static void main(String[] args) {
//        circle_new objc=new circle_new(4);
          cylinder_new objC=new cylinder_new(5,4);
          objC.vol();
          objC.area();


    }
}
