package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        Pyramid py = new Pyramid();
        py.Output();
        // Pyramid.Output();
        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        String name = "Ben";
        int age = 21;
        String favoriteColor = "blue";
        Adlibs ad = new Adlibs();
        String story1 = ad.story(name, age, favoriteColor);
        System.out.println(story1);
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        Replace re = new Replace();
        // re.charReplace("I MAKE BREAD",2,'T');
        System.out.println(re.charReplace("I MAKE BREAD", 2, 'T'));
    }
}
