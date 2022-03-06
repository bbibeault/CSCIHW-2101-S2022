package HW2;

import java.sql.SQLNonTransientConnectionException;
import java.util.Scanner;

import javax.naming.spi.StateFactory;
import javax.print.event.PrintEvent;
import javax.sql.rowset.spi.SyncResolver;

public class MathGames {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
    // c = sqrt(a^2+b^2)
    // NOTE: You can assume you will only need to calculate the Hypotenuse
    // Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
    //      Remember the Triangle has a base, Perpendicular, and Hypotenuse
    // Hint 2: Math.pow and Math.sqrt are your friend here
    // Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
    // Hypotenuse and Perpendicular and return the base.
    
    static Scanner keyboard = new Scanner(System.in);
    public static void pythag(double a, double b){
        System.out.println("--- Number 1 ---");
        System.out.println("What is the base of the triangle?");
        int base = keyboard.nextInt();
        System.out.println("What is the perpindicular of the triangle?");
        int perpindicular = keyboard.nextInt();
        System.out.println("Hypotenuse is " + Math.sqrt((a*a) + (b*b)));
        // CONNECT THIS TO THE PYTHAG BELOW
            
        // This is trying a Scanner
        // System.out.println("--- Number 1 ---");
        // System.out.println("What is the base of the triangle?");
        // int base = keyboard.nextInt();
        // System.out.println("What is the perpindicular of the triangle?");
        // int perpindicular = keyboard.nextInt();
        // System.out.println("Hypotenuse is " + Math.sqrt((base*base) + (perpindicular*perpindicular)));
        
        // This is for a constant number
        // System.out.println();
        // System.out.println("Number 1");
        // int Side1 = 4;
        // int Side2 = 3;
        // String Side3 = "Hypotenuse";
        // System.out.println(Side3 + " is " + (Math.sqrt((Side1*Side1) + (Side2*Side2))));
    }

    // 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
        // A: 100 - 90
        // B:  89 - 80
        // C:  79 - 70
        // D:  69 - 60
        // F:  60 -  0 
        // method should accept the grade as a double and return the letter grade of what I got
        // NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
        // Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
        // Hint 2: You will probably need to cast the double to an int
        // Hint 3: You will probably need to use the Math.ceil() method

        public static void grade;{
        System.out.println("--- Number 2 ---");
        System.out.println("What is your number grade in the class?");
        double grade = keyboard.nextInt();
        grade = Math.ceil(grade);
        if (grade <= 100 && grade >= 90)
            System.out.println("You have an A :)");
        if (grade <=89 && grade >= 80)
            System.out.println("You have a B :)");
        if (grade <=79 && grade >=70)
            System.out.println("You have a C :|");
        if (grade <= 69 && grade >=60)
            System.out.println("You have a D :(");
        if (grade <=59 && grade >=0)
            System.out.println("You have a F >:|");
        }

    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 

 


    // you do not need this main if you want to make a tester class
     public static void main(String[] args)
}
