package HW3;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.w3c.dom.css.Counter;

public class Loops {

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there and should not be adjusted unless otherwise noted (return statments are usually changed)

    //Make a method that will return true if a given string contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){  
        int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'e')count ++;
    }
    if(count >=1 && count <=3)
        return true;
    else
        return false;
    }

    //Given a String str and int n return a larger string that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"

    public static String stringTimes(String str, int n) {
        String s = "";
        for (int i = 0; i < n; i++){
            s += str;
        }
        return s;

        // why and the meaning of the empty string?
    } 


    //Create a method Given a string, return the string where all of the "z" have been removed. Except do not remove a z at the start or end
    //Ex.
    //stringT("zHelloz") -> "zHelloz"
    //stringT("nozthaznks") -> "nothanks"
    //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"

    public static String stringZ(String str) {
        for (int i = 0; i < str.length(); i++){
            if (str.substring(i, i++).equalsIgnoreCase("x")) {
                str.replaceAll(str, "");
            }

        }
        return str;
    }
    // help understanding the second aspect of for loop in parentheses


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

    public static void sums(int numbers){
        }


        // use while loop for it to execute until 0 is put in for it to return false


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
            System.out.println("Input a word for number one.");
            System.out.println(loopE(keyboard.next()));
            System.out.println("Input a word for number two along with how many times it should repeat.");
            System.out.println(stringTimes(keyboard.next(), keyboard.nextInt()));
            System.out.println("Input a word with z's in it to see how they are removed.");
            System.out.println(stringZ(keyboard.next()));
            System.out.println("I will add up the numbers you give me. Please enter as many as you would like. To get the sum, enter 0.");
            // System.out.println(sums(keyboard.nextInt()));
    }
}
// this is a test