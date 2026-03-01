package Generics.Advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListPrinter {

    public List<Number> filterNumbers (List<? extends Number> list){
        List<Number> numbersList = new ArrayList<>();
        for (Number num : list){
            if (num.doubleValue() >= 50){
                numbersList.add(num);
            }
        }
        return numbersList;
    }

    public void printSum (List<? extends Number> list){
        double sum = 0;

        for (Number num : list){
            sum += num.intValue();
        }

        System.out.println("Sum: " + sum);
    }
}