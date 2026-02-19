package Exceptions.Ex_02;

public class Main {
    static void main(String[] args) {
        BnkAcc acc01 = new BnkAcc(11, 0);
        BnkAcc acc02 = new BnkAcc(22, 0);

        try{
            acc01.deposit(-10);
        } catch (NegativeDepositException e){
            System.out.println(e.getMessage());
        }

        try{
            acc01.deposit(500);
        } catch (NegativeDepositException e){
            System.out.println(e.getMessage());
        }

        try{
            acc01.transfer(200, acc02);
        } catch (InvalidTransferAmountException | SameAccountTransferException e){
            System.out.println(e.getMessage());
        }

        try{
            acc02.withdrawal(100);
        } catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

        try{
            acc02.withdrawal(200);
        } catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

        try{
            acc02.transfer(-100, acc01);
        } catch (InvalidTransferAmountException | SameAccountTransferException e){
            System.out.println(e.getMessage());
        }

        try{
            acc01.transfer(150, acc01);
        } catch (InvalidTransferAmountException | SameAccountTransferException e){
            System.out.println(e.getMessage());
        }
    }
}