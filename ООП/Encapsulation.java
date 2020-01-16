package ООП;

public class Encapsulation {
    public static void main(String[] args) {
          Person p=new Person();
          p.setName("Ismoiljon");
          p.setLastName("Rahmonov");
          p.setAge(20);
        System.out.println("Name: "+p.getName());
        System.out.println("LastName: "+p.getLastName());
        System.out.println("Age:" +p.getAge());
        System.out.println();
        p.setName("Abubakr");
        p.setLastName("Habibzoda");
        p.setAge(21);
        System.out.println("Name: "+p.getName());
        System.out.println("LastName: "+p.getLastName());
        System.out.println("Age:" +p.getAge());
    }
}

class Person{
    private String name;
    private String lastName;
    private int age;


    String getName(){
        return name;
    }
    String getLastName(){
        return lastName;
    }

    int getAge(){
        return age;
    }

    void setName(String name){
        this.name=name;
    }

    void setLastName(String lastName){
        this.lastName=lastName;
    }
    void setAge(int age)
    {
        this.age=age;
    }
}