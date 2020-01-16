package ЗадачиООП;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Student[] s=new Student[]{
                new Student("Rahmonov", 10, new int[]{3,4,5,3,4}),
                new Student("Habibzoda", 10, new int[]{4,5,4,5,4}),
                new Student("Sulaymonov",2, new int[]{4,4,4,4,4}),
                new Student("Abdullozoda", 3, new int[]{3,3,3,3,3}),
                new Student("Begmahmadov", 4, new int[]{5,5,5,4,5})
        };


    }
}
class Student{
    String lastname;
    int nGroup;
    int[] y=new int[5];


    Student(String lastname, int nGroup, int[] y){
        this.lastname=lastname;
        this.nGroup=nGroup;
        this.y=y;





        for(int i=0; i<5;i++) {
        if(y[i]<=3) {
         break;

        }
        if (y[i]>=4){
            System.out.println("Lastname: "+lastname);
            System.out.println("number Group: "+nGroup);
            System.out.println("Успеваемости: "+y[i]);
        }
        }
        System.out.println();
    }
}
