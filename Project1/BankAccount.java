package Project1;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.net.ssl.KeyStoreBuilderParameters;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class BankAccount {
    
    private double balance;
    
    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initalBalance){
        balance = initalBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void savings(BankAccount bank, double startAmount) {
        Scanner keyboard = new Scanner (System.in);
        if(startAmount >= 10000) {
            System.out.println("Would you like to start a Savings Account that can accumulate interest? Click 1 for Yes or 2 for No.");
            int savingsChoice;
            int savingsY = 1;
            int savingsN = 2;
            savingsChoice = keyboard.nextInt();
            if(savingsChoice == 1){
                // BankAccount name_savings = new BankAccount(startAmount);
                System.out.println("Thank you for creating a savings account with us! Your balance is " + startAmount + ". Would you like to accumulate interest by a flat rate or compoundly? Click 1 for flat rate or 2 for compound.");
                int intOpt;
                int intY = 1;
                int intN = 2;
                intOpt = keyboard.nextInt();
                if(intOpt == 1){
                    // do flat rate interest
                }else {
                    // do compound interest
                }
            }else {
                    System.out.println("Not a problem. Your starting balance is " + startAmount);
                }
            }
        }

 //test
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public void overdraft(BankAccount bank, double withdrawAmount){
        Scanner keyboard = new Scanner (System.in);
        if(bank.getBalance() > withdrawAmount){
            bank.withdraw(withdrawAmount);
        }else {
            System.out.println("You are trying to withdraw more money than you have in your account. Proceeding will result in an overdraft fee of $35.00. Would you like to proceed? Click 1 for Yes or 2 for No.");
            int choice;
            int Yes = 1;
            int No = 2;
            choice = keyboard.nextInt();
            if(choice == 1){
                bank.withdraw(withdrawAmount + 35);
        }else {
            System.out.println("Your transaction has been cancelled");
        }
    }
}

    public void monthlyfee(){
        withdraw(10);
    }

    // P(1+ R/n)^(nt) - P 
    // P = principal
    // t = years
    // R = annual interest rate
    // n = # of times its compunded
    // PEMDAS 

    public void calcInterest(double p, int t, double r, int n){
        double amount =  p * Math.pow(1 + (r/n), n*t);
        double compinterest = amount - p;
        System.out.println("Compund Interest after "+ t + " years: "+ compinterest);
        System.out.println("Amount after "+ t +" years: "+ amount);
    }

    public static int menu(){
        int selection;
        Scanner input = new Scanner(System.in);

        /************************ */
        System.out.println("Please select and option:");
        System.out.println("-------------------------");
        System.out.println("1: Get Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Compund Interest");
        System.out.println("5: Transfer");
        System.out.println("6: Initialize Savings Account");
        System.out.println("0: Quit");
        System.out.println("-------------------------");

        selection = input.nextInt();

        return selection;
    }

    }

