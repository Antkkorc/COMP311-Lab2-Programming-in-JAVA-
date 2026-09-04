import java.io.PrintWriter;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //using try catch to handle exceptions
        try {
            //creating a PrintWriter object to write to a file
            PrintWriter pw = new PrintWriter("results.txt");
            
            //writing to the file
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter student name: ");
                String name = input.nextLine();
                System.out.print("Enter score: ");
                int score = input.nextInt();
                input.nextLine();
                pw.println(name + "," + score);
            }
            //closing the PrintWriter object
            pw.close();
        } catch (Exception e) {

            //output
            System.out.println("message to print if there is an exception");
        }
    }
}