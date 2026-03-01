package Generics.Ex_2;

public class Pair<T, U>{
    private T value_01;
    private U value_02;

    public void setValue_01(T value_01){
        this.value_01 = value_01;
    }

    public T getValue_01(){
        return value_01;
    }

    public void setValue_02(U value_02){
        this.value_02 = value_02;
    }

    public U getValue_02(){
        return value_02;
    }

    public void print(){
        System.out.println("First value - " + getValue_01());
        System.out.println("Second value - " + getValue_02());
    }
}