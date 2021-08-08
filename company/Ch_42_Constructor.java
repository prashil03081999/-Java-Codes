package com.company;
class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
         id=23;
         name="wtf";
    }
    public MyMainEmployee(String myname,int myId){    //  Constructor
         id=myId;
         name=myname;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}

public class Ch_42_Constructor {
    public static void main(String[] args) {
        //MyMainEmployee emp=new MyMainEmployee("raj",56);
        MyMainEmployee emp1=new MyMainEmployee();
        System.out.println(emp1.getId());
        System.out.println(emp1.getName());

    }
}
