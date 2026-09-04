import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //exception handling using try catch
        try {
            FileReader f = new FileReader("C:\\Users\\anton\\OneDrive\\Documents\\PROJECTS\\Lab2 - Antonio Koketso 24019728\\numbers.txt"); //fileReader
            Scanner s = new Scanner(f); //Scannerise the reader
            
            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;
            int sum = 0;
            int count = 0;
            
            //iterate through the contents of the file
            while (s.hasNextInt()) {//reading integers
                int num = s.nextInt();
                
                if (num < smallest) {
                    smallest = num;
                }
                if (num > largest) {
                    largest = num;
                }
                
                sum = sum + num;
                count++;
            }
            
            double average = (double) sum / count;
            
            //create a new writer to create a text file
            PrintWriter pw = new PrintWriter("C:\\Users\\anton\\OneDrive\\Documents\\PROJECTS\\Lab2 - Antonio Koketso 24019728\\stats.txt");
            
            //writing to the file
            pw.println("Smallest: " + smallest);
            pw.println("Largest: " + largest);
            pw.println("Average: " + average);
            
            //illustrating close method
            pw.close();
        } catch (Exception e) {
            //output the relevant message
            System.out.println("message to print if there is an exception");
        }
    }
}