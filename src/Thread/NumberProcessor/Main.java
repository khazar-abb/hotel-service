package Thread.NumberProcessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++){
            list.add(random.nextInt(100));
        }

        int partSize = list.size() / 4;

        List<Integer> part1 = list.subList(0, partSize);
        List<Integer> part2 = list.subList(partSize, partSize * 2);
        List<Integer> part3 = list.subList(partSize * 2, partSize * 3);
        List<Integer> part4 = list.subList(partSize * 3, list.size());

        Thread t1 = new Thread(new NumberProcessor(part1));
        Thread t2 = new Thread(new NumberProcessor(part2));
        Thread t3 = new Thread(new NumberProcessor(part3));
        Thread t4 = new Thread(new NumberProcessor(part4));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
