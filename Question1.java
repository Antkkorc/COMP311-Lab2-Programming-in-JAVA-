import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        //creating a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a numeric score between 0 and 100: ");
        int score = input.nextInt();
        
        //outputting the grade based on the score
        if (score >= 80 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade: B");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Grade: C");
        } else if (score >= 50 && score <= 59) {
            System.out.println("Grade: D");
        } else if (score >= 0 && score < 50) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Invalid score");
        }
    }
}