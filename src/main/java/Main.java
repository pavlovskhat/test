import java.util.*;


public class Main {

  public static String removeDuplicates(String input) {
    // Converted the String input to an array of characters.
    char[] charArray = input.toCharArray();

    // Created the Array to append/add our indices of each checked character
    ArrayList<Character> checked = new ArrayList<>();

    // Created the finalString to convert the Array back to a String.
    String finalString = "";

    // The for loop checks each character if it is duplicated.
    // I also added an extra measure to check the whitespace.
    for (char c : charArray) {
      if ((!checked.contains(c)) || (c == ' ')) {
        checked.add(c); // Appending to the Array.
      }
    }

    // This for loop now iterates through the final checked Array and concatenates each
    // character to the finalString.
    for (char c : checked) {
      finalString += c;
    }
    return finalString; // This returns our finalString!
  }


  public static void main(String[] args) {
    // Example input from the Task PDF.
    String input = "And I tink to myself: what a wonderful world!";

    System.out.println("Original sentence: " + input + "\n");

    // Calling the method that removes the duplicates but still keeps the whitespace.
    String newString = removeDuplicates(input);

    System.out.println("New sentence: " + newString);


  }
}


// Thanks, Farinaaz :)
