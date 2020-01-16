import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MyProject {
    public static void main(String[] args) {
Person1 t=new Person1();
t.displayInfo();

Person1 b=new Person1("Bob");
b.displayInfo();

Person1 j=new Person1("John", 28);
j.displayInfo();


    }
}
class Person1{
    String name;
    int age;

    Person1(){
name="Undiefine";
age=18;
    }

    Person1(String n){
        name=n;
        age=18;
    }
    Person1(String n, int a){
        name=n;
        age=a;
    }

    void displayInfo(){
        System.out.println("Name: "+name+"            Age: "+age);
    }

}