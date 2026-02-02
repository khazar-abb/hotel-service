package az.wallet.service;

public class WalletService {
    double balance;
    String[] history = new String[5];
    double[] amounts = new double[5];
    int count = 0;

//    WalletService(double balance, String[] history, double[] amounts, int count){
//        this.balance = balance;
//        this.history = history;
//        this.amounts = amounts;
//        this.count = count;
//    }

    public void recharge(double amount){
         if (count < 5){
             balance += amount;
             amounts[count] = amount;
             history[count] = "Recharge";
             count++;
         }
    }

    public void spend(double amount, String description){
        if (balance < amount){
            System.out.println("Balance is not enough");
            return;
        }
        if (count < 5){
            balance -= amount;
            amounts[count] = -amount;
            history[count] = description;
            count++;
        }
    }

    public void printHistory(){
        for (int i = 0; i < count; i++){
            System.out.println((i + 1) + ". " + history[i] + " - " + amounts[i]);
        }
    }

    public double getBalance() {
        return balance;
    }
}