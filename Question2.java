import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //asking user for input
        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        //asking user for a letter to check
        System.out.print("Enter a letter to check: ");
        char letter = input.next().charAt(0);
        
        //outputting the results
        System.out.println("Total characters: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        
        //checking if the name starts with the given letter
        if (name.charAt(0) == letter) {
            System.out.println("Starts with " + letter + ": true");
        } else {
            System.out.println("Starts with " + letter + ": false");
        }
    }
}