import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        //handling exceptions using try catch
        try {
            FileReader f = new FileReader("C:\\Users\\anton\\OneDrive\\Documents\\PROJECTS\\Lab2 - Antonio Koketso 24019728\\numbers.txt"); //fileReader
            Scanner s = new Scanner(f);
            
            int evenCount = 0;
            int oddCount = 0;
            
            //contents of the file
            while (s.hasNextInt()) {
                int num = s.nextInt();
                
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            
            //creating a PrintWriter object to write to a file
            PrintWriter pw = new PrintWriter("C:\\Users\\anton\\OneDrive\\Documents\\PROJECTS\\Lab2 - Antonio Koketso 24019728\\counts.txt");
            
            //writing to the file
            pw.println("Even: " + evenCount);
            pw.println("Odd: " + oddCount);
            
            //closing the PrintWriter object
            pw.close();
        } catch (Exception e) {

            //output
            System.out.println("message to print if there is an exception");
        }
    }
}