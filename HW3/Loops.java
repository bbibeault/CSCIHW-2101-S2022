package HW3;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.w3c.dom.css.Counter;

public class Loops {
    Scanner keyboard = new Scanner(System.in);


    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there and should not be adjusted unless otherwise noted (return statments are usually changed)

    //Make a method that will return true if a given string contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){
        // String characters = "";
        // String duplicates = "";
        // String cheat = characters.toString(str.charAt(i));
        // for(int i = 0; i < str.length(); i++) {
        //     if(characters.contains(cheat));
        //     duplicates += cheat;
        //     characters += cheat;

        // }
        // return true;
        return true;
        
        
    //     int count = 0;
    // for (int i = 0; i < str.length(); i++) {
    //     if (str.charAt(i) == 'e')count ++;
    // }
    // if(count >=1 && count <=3)
    //     return true;
    // else
    //     return false;
    }
    // does it have to return something???


    //Given a String str and int n return a larger string that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"

    public static String stringTimes(String str, int n) {
        String one = "";
        for (int i = 0; i < n; i = i + 1);{
            one = one + str;
        }
        return one;
    } 


    //Create a method Given a string, return the string where all of the "z" have been removed. Except do not remove a z at the start or end
    //Ex.
    //stringT("zHelloz") -> "zHelloz"
    //stringT("nozthaznks") -> "nothanks"
    //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"

    public static String stringZ(String str){
        return null; // <- this should be changed 
    }


    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
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
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.

    public static void sums(){
    }


    public static void main(String[] args) {
        loopE("input word here");
        stringTimes("code", 5);
        // stringZ();
        // sum();
        // Add code to help test your methods here
    }
}
// this is a test