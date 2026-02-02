package String;

import java.util.Scanner;

public class Main {
    static void main() {
        // 1.
        StringBuilder str = new StringBuilder("Hello");
        str.append(",").append(" World!");
        String text = str.toString();
        System.out.println(text);

        // 2.
        String word = "Java";
        StringBuilder builder = new StringBuilder("Java");
        builder.setCharAt(0, 'Y');
        String word_02 = "Y" + word.substring(1);

        System.out.println("String - " + word);
        System.out.println("StringBuilder - " + builder);

        // 3.
        StringBuilder sb_02 = new StringBuilder(20);
        sb_02.append("Programming");
        System.out.println(sb_02);
        System.out.println("length + capacity - " + sb_02.length() + " and " + sb_02.capacity());
        sb_02.append("is fun");
        System.out.println("length + capacity - " + sb_02.length() + " and " + sb_02.capacity());
        sb_02.append("overlimit");
        System.out.println("length + capacity - " + sb_02.length() + " and " + sb_02.capacity());

        // 4.
        String e_string = " ";
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++){
            e_string += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("String operation time: " + (end - start) + "ms");

        StringBuilder e_builder = new StringBuilder();
        long startSB = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++){
            e_builder.append(i);
        }
        long endSB = System.currentTimeMillis();
        System.out.println("StringBuilder operation time: " + (endSB - startSB) + "ms");

        // 5.
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME I WILL REVERSE IT :)");
        String input = scanner.nextLine();
        StringBuilder tool = new StringBuilder(input);
        tool.reverse();
        System.out.println("revesred text: " + tool);
    }
}