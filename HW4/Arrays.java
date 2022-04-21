package HW4;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthSpinnerUI;

import HW3.Loops;

public class Arrays {

    // CONVERT THE SUMS METHOD FROM HW3 TO ADD EACH VALUE TO AN ARRAY AND THEN OUTPUT THE ARRAY AND THE TOTAL.
    // SEE HW3 FOR SUMS METHOD
    // If you want to use an ArrayList for the inputs to be dynamic that is okay
    // Otherwise if you are using a regular array, assume the size is 10 total. 
    // EXAMPLE 
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 0
    // Total: 22
    // Array: {12,2,3,4,1,0}
    public static void Arraysums() {
        Scanner keyboard = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int number;
        int[] arr = new int[10];
        System.out.println("Please enter a number: To see your total, enter 0.");
        number = keyboard.nextInt();
        while (number != 0 && count < 10) {
            arr[count++] = number;
            total += number;
            System.out.println("The total is " + total + ".");
            System.out.println("Please enter a number: To see your total, enter 0.");
            number = keyboard.nextInt();
        }
        System.out.println("Total: " + total);
        System.out.print("Array: {");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
            if (i < count - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }

    // Create a method that will brute force a password EX.
    // bruteForce("ZZZZ")
    // The program should then guess each char of the string and compare it to see if it is equal
    // to the index of the alphabet char array below
    // Output Example:
    // Z
    // ZZ
    // ZZZ
    // ZZZZ

    // Hint 1: using a char array for the password is helpful here 
    // Hint 2: using the method .toCharArray is a way to convert the password parameter to
    // a char array as well
    // From there creating for and while loops to compare the values is trivial
    public static String bruteForce(String password){
        String answer = "";
        char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '!', '@', '#', '$', '%', '^', '&', '*', '(', ')','<','>','/','?'};
    char[] arr = password.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (arr[i] == alphabet[j]) {
                    answer += alphabet[j];
                    break;
                }
            }
            System.out.println(answer);
        }
        return answer; 
    }

    // Create a method that will sort an Array of integers from smallest to greatest.
    // NOTE: You CANNOT use the built in Array.sort method
    // Ex. 
    // sorter([9,10,2,5,3,4,7,8]) -> [2,3,4,5,7,8,9,10]

    // Hint 1: a temp Array is a helpful way to store variables for comparing 
    // Hint 2: 2 nested For loops should be all thats needed for the swapping logic
    public static int[] sorter(int[] nums){
        int [] sortedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedArray[i] = nums[i];
        }
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 1; j < sortedArray.length; j++) {
                if (sortedArray[j-1] > sortedArray[j]) {
                    int temp = sortedArray[j - 1];
                    sortedArray[j - 1] = sortedArray [j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Arraysums();
        System.out.println();
        System.out.println("Enter a password with only letters and symbols.");
        bruteForce(keyboard.next());
        System.out.println("Enter numbers to be sorted from smallest to greatest.");
        System.out.println(sorter(nums));
    }

    
}