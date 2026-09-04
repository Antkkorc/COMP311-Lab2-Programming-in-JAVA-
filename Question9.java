import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        //using try catch to handle exceptions
        try {
            FileReader f = new FileReader("C:\\Users\\anton\\OneDrive\\Documents\\PROJECTS\\Lab2 - Antonio Koketso 24019728\\numbers.txt"); //fileReader
            Scanner s = new Scanner(f);
            
            int positiveSum = 0;
            int negativeSum = 0;
            int positiveCount = 0;
            int negativeCount = 0;
            
            //contents of the file
            while (s.hasNextInt()) {
                int num = s.nextInt();
                
                if (num >= 0) {
                    positiveSum = positiveSum + num;
                    positiveCount++;
                } else {
                    negativeSum = negativeSum + num;
                    negativeCount++;
                }
            }
            
            //creating a PrintWriter object to write to a file
            PrintWriter pw = new PrintWriter("C:\\Users\\anton\\OneDrive\\Documents\\PROJECTS\\Lab2 - Antonio Koketso 24019728\\sums.txt");
            
            //writing to the file
            pw.println("Positive sum: " + positiveSum);
            pw.println("Positive count: " + positiveCount);
            pw.println("Negative sum: " + negativeSum);
            pw.println("Negative count: " + negativeCount);
            
            //closing the PrintWriter object
            pw.close();
        } catch (Exception e) {
            //output the relevant message
            System.out.println("message to print if there is an exception");
        }
    }
}