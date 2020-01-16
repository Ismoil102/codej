package ООП;

public class Polimorfizm {
    public static void main(String[] args) {
        Shape[] a=new Shape[]{new Circle(), new Square(), new Triangle()};
        for (int i=0; i<a.length; i++)
            a[i].draw();
    }
}
