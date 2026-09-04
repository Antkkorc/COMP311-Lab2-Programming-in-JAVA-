import java.io.FileReader;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        //using try catch to handle exceptions
        try {
            FileReader f = new FileReader("students.txt");
            Scanner s = new Scanner(f);

            //contents of the file
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        } catch (Exception e) {

            //output
            System.out.println("message to print if there is an exception");
        }
    }
}