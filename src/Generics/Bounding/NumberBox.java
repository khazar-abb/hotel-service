package Generics.Bounding;

import java.util.List;

public class NumberBox <T extends Number>{
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public void print(){
        System.out.println(value);
    }

    public double sum(T otherValue){
        if (otherValue == null){
            throw new IllegalArgumentException("Cannot add null value!");
        }
        return value.doubleValue() + otherValue.doubleValue();
    }
}