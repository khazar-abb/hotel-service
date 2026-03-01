package Generics.MyQuestion;

public class BoxGeneric<T> {
    T value;

    public BoxGeneric(T value) {
        this.value = value;
    }

    public void print(T value){
        System.out.println(value);
    }
}