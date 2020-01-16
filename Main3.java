import java.util.Random;
import java.util.StringTokenizer;

public class Main3 {
    public static void main(String[] args) {
Student[] Massive=new Student[10];
        Random ran=new Random();
        String[] name=new String[]{"Максим", "Валентин", "Дима", "Женя", "Коля", "Сергей", "Василий", "Виталий", "Григорий", "Олексей"};
String[] fam=new String[]{"Грибенко", "Милон", "Косенко", "Мирошничюк", "Владовннко", "Слизько", "Гаврило", "Кахошко", "Ведмеденко", "Лонтовко"};
String[] otche=new String[]{"Евгенович", "Петровыч", "Алексейичь", "Михайлович", "Едуардов", "Васильович", "Арсенович", "Павлович", "Анатолиевич", "Владиславович"};

        int[] Massive2 = new int[10];
for (int x=0; x<10;x++){
      int bol=0;
      for (int y=0; y<10; y++){
          if (Massive[x].midle>Massive[y].midle)
              bol++;
      }
      Massive2[x]=bol+1;
}
for (int x=0; x<10;x++){
    if (Massive[x].midle >= 4)
    {
    }
}
    }
}
class  Student{
    String fam;
    String name;
    String otche;
    int numGroup;
    int[] ycp=new int[5];
    double midle;
}
