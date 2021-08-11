package com.company;
class phone{
    public void game(){
        System.out.println("play games from class phone");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}
class smartPhone extends phone {  // extends plays an vitalrole role to below func-
    public void music(){
        System.out.println("play music  from class smartphone");
    }
    public void on(){
        System.out.println("Turning on smartphone");
    }

}

public class Ch_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
         phone obj = new smartPhone();
         obj.on();  // it will run the turning on smartphn
        obj.game();
        //obj.music;  //      this is not allowed in dynamic method dispatch




    }
}
