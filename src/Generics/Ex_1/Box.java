package Generics.Ex_1;

public class Box <T> {
    T value;

    public Box(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void printInfo(){
        System.out.print(value.getClass().getName() + " - ");
        System.out.println(value);
    }
}