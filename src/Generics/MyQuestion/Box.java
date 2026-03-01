package Generics.MyQuestion;

public class Box {
    String a;
    Integer b;

    public Box(String a) {
        this.a = a;
    }

    public Box(Integer b) {
        this.b = b;
    }

    public void print(String a){
        System.out.println(a);
    }

    public void print(Integer b){
        System.out.println(b);
    }
}