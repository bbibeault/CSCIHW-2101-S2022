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
        if(startAmount >= 10000) {
            System.out.println("Would you like to start a Savings Account that can accumulate interest?");
        }
            // how to do input with if function such as yer or no
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
            System.out.println("Why");
            // how to do input with if function
        }

        // }else if(bank.getBalance() < withdrawAmount) {
        //     System.out.println("You are trying to withdraw more money than you have in your account. Proceeding will result in an overdraft fee of $35.00. Would you like to proceed? Click 1 for Yes or 2 for No.");
        //     int Y = '1';
        //     int N = '2';
        //     Y = keyboard.nextInt();
        //         bank.withdraw(withdrawAmount + 35);
        //     N = keyboard.nextInt();
        //     System.out.println("Your transacion has been cancelled.");
        // }
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

