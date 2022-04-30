package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.MatchResult;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ArrayListPlayground {
    public static void main(String[] args) {
    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    System.out.println("--- Question 1 ---");
    ArrayList<Integer> oneArray = new ArrayList<Integer>(15);
    oneArray.add(1);
    oneArray.add(2);
    oneArray.add(3);
    oneArray.add(4);
    oneArray.add(5);
    oneArray.add(6);
    oneArray.add(7);
    oneArray.add(8);
    oneArray.add(9);
    oneArray.add(10);
    oneArray.add(11);
    oneArray.add(12);
    oneArray.add(13);
    oneArray.add(14);
    oneArray.add(15);
    // b) Output the value of the tenth element of the array nums.
    System.out.println(oneArray.get(10));
    // c) Set the value of the 5th element of the array nums to 99.
    oneArray.set(5, 99);
    System.out.println(oneArray.get(5));
    // d) set the value of the 13th element to 15
    oneArray.set(13, 15);
    System.out.println(oneArray.get(13));
    // d) set the value of the 2nd element to 6
    oneArray.set(2, 6);
    System.out.println(oneArray.get(2));
    // d) Set the value of the 9th element of the array nums to the sum of the 13th and 2nd elements of the array nums.
    oneArray.set(9, (oneArray.get(13) + oneArray.get(2)));
    System.out.println(oneArray.get(9));
         
    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    ArrayList <String> weekArray = new ArrayList <String>();
    weekArray.add("Monday");
    weekArray.add("Tuesday");
    weekArray.add("Wednesday");
    weekArray.add("Thursday");
    weekArray.add("Friday");
    weekArray.add("Saturday");
    weekArray.add("Sunday");

    // b) output each of the days of the week
    System.out.println("--- Question 2b ---");
    System.out.println(weekArray);
            
    // c) output the days of the week that we have class
    System.out.println("--- Question 2c ---");
    System.out.println(weekArray.get(1));
    System.out.println(weekArray.get(3));
        // for (int i = 0; i == 1 || i == 3; i++) {
        //     System.out.println(weekArray.get(i));
        // }

    // d) change the arrayList to start on Sunday
    System.out.println("--- Question 2d ---");
        String day = "Sunday";
        int dayPosition = weekArray.indexOf(day);
        weekArray.remove(dayPosition);
        weekArray.add(0, day);
        for (int i = 0; i < weekArray.size(); i++) {
            System.out.println(weekArray.get(i));
        }

    // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    System.out.println("--- Question 3a ---");
    Scanner keyboard = new Scanner(System.in);
    ArrayList<Integer> userInputArray = new ArrayList<Integer>();
     System.out.println("Enter the numbers to add in ArrayList");
     System.out.println("Number:");
     int data = keyboard.nextInt();
     while (data!=0) {
     userInputArray.add(data);
     System.out.println(userInputArray);
     System.out.println("Number:");
     data = keyboard.nextInt();
  }
    ArrayList<Integer> inputNum = new ArrayList<Integer>();
    // int n = keyboard.nextInt();
    //     while ( n != 0) {
    //         inputNum.add(n);
    //     }
    //     System.out.println(inputNum);
        // if (n == 0) {
        //     System.out.println(inputNum);
        // }

    // b) return the largest and smallest number
    System.out.println("--- Question 3b ---");
    // int s = inputNum.size();
    // int min = inputNum.get(0);
    // for (int i = 0; i < s; i++) {
    //     if (inputNum.get(i) < min) {
    //         min = inputNum.get(i);
    //     }
    // }
    // int max = inputNum.get(0);
    // for (int i = 1; i < s; i++) {
    //     if (inputNum.get(i) > max) {
    //         max = inputNum.get(i);
        // }
    // }
    System.out.println();

    Integer max = Collections.max(userInputArray);
    Integer min = Collections.min(userInputArray);
    System.out.println("ArrayList values : " + userInputArray);
    System.out.println("ArrayList max value : " + max);
    System.out.println("ArrayList min value: " + min);

    // c) return the ArrayList sorted smallest to largest
    System.out.println("--- Question 3c ---");
    Collections.sort(userInputArray);
    System.out.println("Least to greatest is: " + userInputArray);

    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 
    // Hint 1: use collections sort to sort the numbers 
    // Hint 2: you can see if the size of the array list is divisible by 3 by running:
    //  numbers.size()%3==0
    // Hint 3: You can use this logic to print the array list in a 3x3 pattern once its created:
    // for(int i=0;i<numbers.size();i++)
    //     {
    //         System.out.print(numbers.get(i)+" ");
    //         if((i+1)%3==0)
    //         {
    //             System.out.println();
    //         }
    //     }

    System.out.println("--- Question 3d ---");
    // GETTING TOTAL NUMBER OF ARRAY
    System.out.println(userInputArray.size());
    // SEEING IF ARRAY LIST TOTAL IS DIVISIBLE BY THREE
    for (userInputArray.size();;) {
        if (userInputArray.size() % 3 == 0) {
            System.out.println("Array is divisible by 3.");
            // get infinite loop lol
        // } else (userInputArray.add(keyboard.nextInt()));
        }
    }
    // TO PRINT ARRAY IN A MATRIX
    // for(int i = 0; i < userInputArray.size(); i++) {
    //     System.out.print(userInputArray.get(i) + " ");
    //     if((i+1) % 3 == 0) {
    //         System.out.println();
    //     }
    // }
    // unreachable??

}
}