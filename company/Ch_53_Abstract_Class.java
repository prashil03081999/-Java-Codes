package com.company;
abstract class parent{
    public parent(){
        System.out.println("I am base2 constructor of base2 class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet1();
}
class child extends parent{

    @Override
    public void greet1() {
        System.out.println("Good Morning");
    }
}

public class Ch_53_Abstract_Class {
    public static void main(String[] args) {
        child c =new child();
        // parent p= new parent();   u can create obj fr parent coz its an abstract class
        // u cannot create the obj for abstract class.

            }
        }
