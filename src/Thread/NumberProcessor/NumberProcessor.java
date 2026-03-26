package Thread.NumberProcessor;

import java.util.List;

public class NumberProcessor implements Runnable {
    private List<Integer> numbers;

    public NumberProcessor(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Thread sum: " + sum);
    }
}