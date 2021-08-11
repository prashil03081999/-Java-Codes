package com.company;
class a{
    public int a;
    public int Prashil(){
        return 2;
    }
    public void method2(){
        System.out.println("I am a method 2 of class a");
    }
}
class b extends a{
    @Override
    public void method2(){
        System.out.println("I am a method 2 of class b");
    }
    public void method3(){
        System.out.println("I am a method 3 of class b");
    }

}


public class Ch_48_Method_Overriding {
    public static void main(String[] args) {
        a A=new a();
        A.method2();
        b B=new b();
        B.method2();

    }
}
