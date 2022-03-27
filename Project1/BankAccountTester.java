package Project1;

import java.util.Scanner;



public class BankAccountTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello and welcome! Please enter your name:");
        BankAccount gregChecking = new BankAccount(20000);
        String name = keyboard.nextLine();
        System.out.println("Welcome " + name + "! How much would you like start your account with?");
        double startAmount = keyboard.nextDouble();
        BankAccount name_checking = new BankAccount(startAmount);
        name_checking.savings(name_checking, startAmount);

        System.out.println("Great! " + name +", your starting balance is: $"+ name_checking.getBalance());
        
        int menuSelection = BankAccount.menu();
        System.out.println(menuSelection);
        
        if(menuSelection == 1){
            System.out.println("Getting account balance...");
            System.out.println("Total balance: $"+name_checking.getBalance());

        }else if (menuSelection == 2){
            System.out.println("Please enter the amount to deposit");
            double depositAmount = keyboard.nextDouble();
            name_checking.deposit(depositAmount);
            System.out.println("Amount: $"+depositAmount + " was deposited");
            System.out.println("Total balance: $" + name_checking.getBalance());

        }else if (menuSelection == 3){
            System.out.println("Please enter the amount to withdraw");
            double withdrawAmount = keyboard.nextDouble();
            // name_checking.withdraw(withdrawAmount);
            name_checking.overdraft(name_checking, withdrawAmount);
            // System.out.println(name_checking.getBalance());
            // System.out.println("Amount: $"+ withdrawAmount + " was withdrawn");
            System.out.println("Total balance: $" + name_checking.getBalance());

        }else if (menuSelection == 4){
            System.out.println("Please enter the amount of years");
            int years = keyboard.nextInt();
            name_checking.calcInterest(name_checking.getBalance(), years, 0.15, 12);

        }else if (menuSelection == 5){
            name_checking.transfer(name_checking.getBalance(), gregChecking);
            int amount = keyboard.nextInt();

        }else if (menuSelection == 0){
            System.out.println("Have a nice day!");
        }else{
            System.out.println("Error: No Valid Selection");
        }
        // name_checking.overdraft(name_checking, 500);
        // System.out.println(name_checking.getBalance());
    }
}
