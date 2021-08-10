package com.company;
class base1{
    public  int x;
    base1(){
        System.out.println("Iam a Constructor");
    }
    base1(int x){
        System.out.println("Iam a Overloaded Constructor of base1 class with  value of a: "+ x);
    }


}
class derived1 extends base1{
    derived1(){
        //super(0);
        System.out.println("Iam derived class Constructor");
    }
    derived1(int x,int y){
        super(x);
        System.out.println("Iam a Overloaded Constructor of derived1 class with  value of y and y:"+y);
    }


}
public class Ch_46_Constrctor_In_Inheritance {
    public static void main(String[] args) {
      // derived1 d1=new derived1();
        derived1 d1=new derived1(12,34);

    }
}
