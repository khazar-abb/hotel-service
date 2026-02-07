package InheritancePolymorphism.TrickyInterviewLevel;

public class Main {
    static void main() {
        Payment p = new CardPayment();
        p.process();
        // Answer: Upcasting - we created child class object by using reference of parent class.
    }
}
