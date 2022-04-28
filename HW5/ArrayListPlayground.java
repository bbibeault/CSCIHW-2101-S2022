package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    ArrayList<Integer> oneArray = new ArrayList<Integer>(15);
    // b) Output the value of the tenth element of the array nums.
    System.out.println(oneArray.get(9));
    // c) Set the value of the 5th element of the array nums to 99.
    oneArray.set(4, 99);
    // d) set the value of the 13th element to 15
    oneArray.set(12, 15);
    // d) set the value of the 2nd element to 6
    oneArray.set(1, 6);
    // d) Set the value of the 9th element of the array nums to the sum of the 13th and 2nd elements of the array nums.
    oneArray.set(8, (oneArray.get(12) + oneArray.get(1)));
         
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
    System.out.println(weekArray);
            
    // c) output the days of the week that we have class
        for (int i = 0; i == 1 || i == 3; i++) {
            System.out.println(weekArray.get(i));
        }

    // d) change the arrayList to start on Sunday
        String day = "Sunday";
        int dayPosition = weekArray.indexOf(day);
        weekArray.remove(dayPosition);
        weekArray.add(0, day);
        for (int i = 0; i < weekArray.size(); i++) {
            System.out.println(weekArray.get(i));
        }

    // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    Scanner keyboard = new Scanner(System.in);
    ArrayList<Integer> inputNum = new ArrayList<Integer>();
    while (true) {
        System.out.println("Enter a number to add to the array. Enter 0 to stop.");
        int n = keyboard.nextInt();
        if (n == 0) {
            System.out.println(inputNum);
        }
        else {
            inputNum.add(n);
        }
    }


    // b) return the largest and smallest number
    
    int s = inputNum.size();
    int min = inputNum.get(0);
    for (int i = 0; i < s; i++) {
        if (inputNum.get(i) < min) {
            min = inputNum.get(i);
        }
    }
    int max = inputNum.get(0);
    for (int i = 1; i < s; i++) {
        if (inputNum.get(i) > max) {
            max = inputNum.get(i);
        }
    }

    // c) return the ArrayList sorted smallest to largest
    
    Collections.sort(inputNum);
    System.out.println("Least to greatest is: " + inputNum);

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

    for (int i : inputNum) {
        if (i % 3 == 0) {
            System.out.println("This number is divisible by three: " + i);
            // to find numbers divisible by three
        }
    }

}
}