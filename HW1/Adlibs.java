package HW1;


// make a method that accepts 2 Strings and 1 int (Someones name, age, and favorite color and then returns a story about them)
// Hint1: The objects name is Adlibs and you require a name age and favoriteColor all in strings
// Hint2: You will need to return a string. You can concat the variables and the strings together
// Hint3: A sample story if you are lost can be as simple as "Hello! My name is ____, and I am ____, and my favorite  
//        color is ___"
public class Adlibs {
    public  String story(String name, int age, String favoriteColor) {
        String answer = "Hello! My name is " + name + ", and I am " + age + ", and my favorite color is " + favoriteColor + ".";
        return answer;
    }
    // public static void main(String[] args) {
    //     String nameFirst = "Ben";
    //     String nameLast = "Bibeault";
    //     String pets = "cats";
    //     String petName1 = "Dorie";
    //     String petName2 = "Virginia";
    //     String job = "RA";
    //     String hobby = "Track and Field Team";
    //     System.out.println(nameFirst + " " + nameLast + " -- " + "Homework 1");
    //     int age = 21;
    //     int schoolYear = 3;
    //     System.out.println("Hi, my name is " + nameFirst + " " + nameLast + ". I am " + age + " years old, and this is my " + schoolYear + " year at Stockton.");
    //     System.out.println("I have two " + pets + "," + " and their names are " + petName1 + " and " + petName2 + ".");
    //     System.out.println("I am a " + job + " at Stockton, and I also am a part of the " + hobby + ".");
    //     // Wanted to a little more than just a simple introduction so I added in more variables, hope it all is correct!;
    // }
}
