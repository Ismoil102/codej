package ООП;

import javax.sound.sampled.Line;

public class Inson {
    public static void main(String[] args) {
Student s=new Student();

s.setName("Ismoiljon");
s.setLastName("Rahmonov");
s.setAge(20);
s.setEmail("i.rahmonov@inbox.ru");
s.setCourse(4);
s.setGradies("Fine");
//s.setStatus("Student");


        System.out.println("-------------------Table Students-------------------");
        System.out.println("Name:" +s.getName());
        System.out.println("LastName: "+s.getLastName());
        System.out.println("Age: "+s.getAge());
        System.out.println("Email: "+s.getEmail());
        System.out.println("Course: "+s.getCourse());
        System.out.println("Gradies: "+s.getGradies());
       // System.out.println("Status: "+s.getStatus());
        System.out.println("---------------------------------------------------------------------");

        Teacher t=new Teacher();
        t.setName("Jovidon");
        t.setLastName("Akhmedov");
        t.setAge(25);
        t.setSubject("Programing");
        t.setEmail("jovidonakhmedov@mail.ru");
      //  t.setStatus("Student");

        System.out.println();
        System.out.println("--------------------------------------Table Teachers-------------------------------");
        System.out.println("Name: "+t.getName());
        System.out.println("LastName: "+t.getLastName());
        System.out.println("Age: "+ t.getAge());
        System.out.println("Subject: "+t.getSubject());
        System.out.println("Email: " +t.getEmail());
        //System.out.println("Status: "+t.getStatus());

        System.out.println("------------------------------------------------------------------------------------");
    }
}


class InfoInson{
    String name;
    String lastName;
    String email;
    int age;
    //String status;


}


class Student extends InfoInson{
    private int course;
    private String gradies;


    int getCourse(){
     return course;
    }


    String getGradies(){
        return gradies;
    }

    void setCourse(int course){
        this.course=course;
    }

    void setGradies(String gradies){
        this.gradies=gradies;
    }


    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    String getLastName(){
        return lastName;
    }

    void setLastName(String lastName){
       this.lastName=lastName;
    }

    String getEmail(){
        return email;
    }

    void setEmail(String email){
        this.email=email;
    }

    int getAge(){
        return age;
    }

    void setAge(int age){
        this.age=age;
    }
//
//    String getStatus(){
//        return status;
//    }
//
//    void setStatus(String status){
//        this.status=status;
//    }
}


class Teacher extends InfoInson{
private  String subject;


String getSubject()
{
    return subject;
}

void setSubject(String subject){
    this.subject=subject;
}


    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    String getLastName(){
        return lastName;
    }

    void setLastName(String lastName){
        this.lastName=lastName;
    }

    String getEmail(){
        return email;
    }

    void setEmail(String email){
        this.email=email;
    }

    int getAge(){
        return age;
    }

    void setAge(int age){
        this.age=age;
    }

//    String getStatus(){
//        return status;
//    }
//
//    void setStatus(String status){
//        this.status=status;
   // }
}