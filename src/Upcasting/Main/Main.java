package Upcasting.Main;

import Upcasting.Pay.Pay;
import Upcasting.Pay.PayX;
import Upcasting.Pay.PayY;
import Upcasting.Pay.PayZ;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        Pay pay;

        switch (type.toLowerCase()){
            case "x": pay = new PayX(); break;
            case "y": pay = new PayY(); break;
            case "z": pay = new PayZ(); break;
            default:
                System.out.println("invalid payment type.");
                return;
        }
        pay.payment();
    }
}