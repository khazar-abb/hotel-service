package Lambda;

public class Lambda_03 {
    static void main(String[] args) {
        Operation addition = Integer::sum;
        System.out.println(addition.apply(5, 9));


        Operation subtraction = (a, b) -> a - b;
        System.out.println(subtraction.apply(5, 9));

        Operation multiplication = (a, b) -> a * b;
        System.out.println(multiplication.apply(5, 9));
    }
}
