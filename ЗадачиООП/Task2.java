package ЗадачиООП;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
Train[] t=new Train[]{
new Train("Dushanbe", 150,60),
        new Train("Minsk", 280, 120 ),
        new Train("Tashkent", 340, 30),
        new Train("Moscow", 750, 45),
        new Train("Astana", 780, 80)
};
    }
}

class  Train{
    String  nPunkt;
    int nTrain;
    int time;

    Train(String nPunkt, int nTrain, int time){
        this.nPunkt=nPunkt;
        this.nTrain=nTrain;
        this.time=time;
        Scanner sc=new Scanner(System.in);
        nTrain=sc.nextInt();
        if (nTrain==150){
            System.out.println("Назначения пункта: "+nPunkt);
            System.out.println("Номер поезда: "+nTrain);
            System.out.println("Время: "+time);
        }
                if (nTrain==280){
            System.out.println("Назначения пункта: "+nPunkt);
            System.out.println("Номер поезда: "+nTrain);
            System.out.println("Время: "+time);
        }

        if (nTrain==340){
            System.out.println("Назначения пункта: "+nPunkt);
            System.out.println("Номер поезда: "+nTrain);
            System.out.println("Время: "+time);
        }
         if (nTrain==750){
            System.out.println("Назначения пункта: "+nPunkt);
            System.out.println("Номер поезда: "+nTrain);
            System.out.println("Время: "+time);
        }
        if (nTrain==780){
            System.out.println("Назначения пункта: "+nPunkt);
            System.out.println("Номер поезда: "+nTrain);
            System.out.println("Время: "+time);
        }


    }
    
}
