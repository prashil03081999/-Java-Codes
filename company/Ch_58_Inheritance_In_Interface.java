package com.company;
interface sample1{
    void method1();
    void method2();
}
interface sample2 extends sample1{// we can extend interface but we cannot extend interface in class we have to use implements.
    void method3();
    void method4();

}
class sample3 implements sample2{
    public void method1(){      // don't miss the public in writing methods in class.
        System.out.println("Method 1");
    }
    public void method2(){
        System.out.println("Method 2");

    }
    public void method3(){
        System.out.println("Method 3");

    }
    public void method4(){
        System.out.println("Method 4");
    }

}
public class Ch_58_Inheritance_In_Interface {
    public static void main(String[] args) {
        sample3 obj=new sample3();
        obj.method1();
        obj.method2();
        obj.method3();

    }
}
