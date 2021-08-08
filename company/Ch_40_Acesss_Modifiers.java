package com.company;
class MyEmployee{
    private int id;
    private String name;

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

public class Ch_40_Acesss_Modifiers{
    public static void main(String[] args) {
        MyEmployee emp=new MyEmployee();
        emp.setName("Prashil");
        emp.setId(3);
        System.out.println(emp.getName());
        System.out.println(emp.getId());


    }

}
