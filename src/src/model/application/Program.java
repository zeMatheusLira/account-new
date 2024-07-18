package model.application;

import model.domainexception.DomainException;
import model.entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account date");
            System.out.print("Number:");
            Integer number = sc.nextInt();
            System.out.print("holder:");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance:");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println(account);

            System.out.println("Enter amount for withdraw");
            Double amount = sc.nextDouble();
            account.withdrawLimit(amount);

            System.out.println("New balance: "+account.getBalance());

            sc.close();
        }
        catch (DomainException e){
            System.out.println("Withdraw error: "+e.getMessage());
        }
    }
}
