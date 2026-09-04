import java.io.FileReader;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //asking user for input
        System.out.print("Enter a number to search for: ");
        int searchNum = input.nextInt();
        
        boolean found = false;
        
        //handling exceptions using try catch
        try {
            //reading from the file
            FileReader f = new FileReader("C:\\Users\\anton\\OneDrive\\Documents\\PROJECTS\\Lab2 - Antonio Koketso 24019728\\numbers.txt");
            Scanner s = new Scanner(f);
            
            //contents of the file
            while (s.hasNextInt()) {
                int num = s.nextInt();
                
                if (num == searchNum) {
                    found = true;
                }
            }
        } catch (Exception e) {

            //output
            System.out.println("message to print if there is an exception");
        }
        
        System.out.println(found);
    }
}