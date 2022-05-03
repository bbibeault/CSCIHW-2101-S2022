package Project3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ladder {
    // Panels are the physical glass or tempered glass sheets
    public int panels;
    // ladder is the ladder structure (2d array)
    public int[][] ladder;
    // round counter
    public int round = 1;

    // make a ladder object with no parameter (default 5 panels)
    public Ladder(){
    }

    // make a ladder object with a panel parameter and assign the panels to that int
    public Ladder(int panels){
    }

    // create an array list of integers for the selections 
    ArrayList<Integer> selectionList = new ArrayList<Integer>();

    // ----make a int method to get the selection from the user called getSelection()---
    Scanner keyboard = new Scanner (System.in);
    int getSelection = keyboard.nextInt();

    // create a int variable for converetedSelection
    int convertedSelection;

    // collect the selection ( use scanner here )
        // if selection is L or l convert the selection to 0
        // Print the selection selected
        // return convertedSelection
    // else if selection is R or r
        // convertSelection = 1
        // Print the selection selected
        // return the converted selection
    // else print selection is invalid 
    String userSelection = keyboard.nextLine();
    if (userSelection == "l") {
        char l = 0;
        int conversion0 = Character.getNumericValue(l);
    } else if (userSelection == "L") {
        char L = 0;
        int conversion1 = Character.getNumericValue(L);
    } else if (userSelection == "r") {
        char r = 1;
        int conversion2 = Character.getNumericValue(r);
    } else if (userSelection == "R") {
        char R = 1;
        int conversion3 = Character.getNumericValue(R);
    } else {
        System.out.println("Please select a valid option.");
    }
    // else if not highlighted

    // REMEMBER 2d array is [row][column]
    
    // create a 2d array method called createLadder()
    // inside this method create a new 2d array where your rows 
    // are the panels and the colums is hard coded to 2 
    // make a double for loops with variables i and j
    // the i variable will check for the ladder.length in the logic statement
    // the j variable will check for the ladder[i].length in the logic statment
    // inside the double for loop assign ladder[i][j] to a random int
    // This part might be hard but know you can cast a variable with (int) and then a second statment
    // to make a random variable between 1 and 2 using (2 * Math.random())
    // combining those two is trivial

    // then the magic happens:
    // we need to determine that the random values create do not
    // contain to of the same values per row IE:
    // [0][1]
    // [0][0] <- Duplicate
    // [1][0]
    // [1][1] <- Duplicate
    // make an if statement inside the 'i' of the for loop to check 
    // if the row 'i' of the ladder in the first column is equal 
    // to the row 'i' of the second column 
    // then a second nested if statement to check if the row 'i' of the first column
    // is equal to 0 (use ==0 here)
    // if this is true assign ladder[i][0]=1
    // else we want the value to be 0 so ladder[i][0]=0
    // after all is done return the ladder

    // create a boolean method called calcPanel that takes in the following parameters:
    // 1. 2d int array ladder
    // 2. Integer ArrayList called selections
    
    // This method is pretty complex and will calculate the selections from the user in getSelection
    // and see if it matches up the 2d array from createLadder
    // First create an int size of the selections size 
    // then print the Round variable from above (thats why we made it global)
    // make an int arrayt called temp of size 2 
    // create a for loop as long as i is less than ladder[0].length
        // temp[i] = ladder[size][i]
    // create an int variable called currentSelection to get the current selection from the getSelection method
    // use the array list's add method to add the currentSelection
    // create an int choice to use the selections array list method .get for the selections size-1(also another arraylist method)
    // using an if statment check if temp[choice]==1
        // if it is then the choice is correct 
        // print answer is correct 
        // increment the round counter
        // return true (this is a boolean method afterall)
    // else
        // remove the last variable from the selections arraylist (using size method (size-1) like above)
        // increment the round counter
        // print and say they lose 1 life 
        // return false 
    
    // EVERYTHING AFTER THIS POINT IS TO PRINT THE LADDER
    // HERE IS HOW TO PRINT A BLANK LADDER
    public void printLadderBlank(){
        try {
            System.out.println("|||||| ---- Start");
            for (int i = 0; i < ladder.length; i++) {
                System.out.print("|"+" || "+"|");
                System.out.println();
            }
            System.out.println("|||||| ---- Finish");
        } catch (Exception e) {
            System.out.println("ERROR LADDER IS NOT CREATED OR IS NULL...");
        }
    }
}
}    
