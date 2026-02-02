package az.wallet.main;

import az.wallet.service.WalletService;

public class Main {
    static void main() {
        WalletService walletService = new WalletService();
        System.out.println("Balance: " + walletService.getBalance());

        walletService.recharge(100.00);
        walletService.recharge(50.00);

        walletService.spend(30.00, "Coffee");
        walletService.spend(50.00, "Books");

        walletService.printHistory();
        System.out.println("Balance: " + walletService.getBalance());
    }
}
