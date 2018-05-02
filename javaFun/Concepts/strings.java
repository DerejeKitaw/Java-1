// Strings represent a sequence of characters.
// The most direct way to create a string is to write:

String myVariableName = "My string's value";


// Length - Strings have a method to determine their length.

public class StringDemo {
     public static void main(String[] args) {
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        System.out.println( "String Length is : " + length );
     }
}

// This will result in: String Length is: 23


// Concatenate: A String method that allows two strings to be squashed together. 
// Since each string is immutable, this results in a brand new string.
// The '+' sign is also overloaded to provide the same functionality: "Welcome," + " ninja" + "!"; // displays "Welcome, ninja!"

String string1 = "My name is ";
String string2 = "Michael";
String string3 = string1.concat(string2);
System.out.println(string3);

// will output My name is Michael

// Format: Another way of concatenating strings!

String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.);
System.out.println(ninja);

// Will print out Hi Jack, you owe me $25.00 !
// Where %s is expecting a string
// And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.

// IndexOf: The indexOf() method searches left-to-right inside the given string for a "target" string. 
// The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.

String ninja = "Welcome to Coding Dojo!";
int a = ninja.indexOf("Coding"); // a is 11
int b = ninja.indexOf("co"); // b is 3
int c = ninja.indexOf("pizza"); // c is -1, "pizza" is not found
