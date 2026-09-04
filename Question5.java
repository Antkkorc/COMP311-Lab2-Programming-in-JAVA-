import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        //handling exceptions using try catch
        try {
            //reading from the file
            FileReader f = new FileReader("C:\\Users\\anton\\OneDrive\\Documents\\PROJECTS\\Lab2 - Antonio Koketso 24019728\\students.txt");
            Scanner s = new Scanner(f);
            
            //creating a PrintWriter object to write to a file
            PrintWriter pw = new PrintWriter("grades.txt");
            
            //contents of the file
            while (s.hasNextLine()) {
                String line = s.nextLine();
                
                int commaIndex = line.indexOf(',');
                String name = line.substring(0, commaIndex);
                int score = Integer.parseInt(line.substring(commaIndex + 1));
                
                String grade;
                if (score >= 80 && score <= 100) {
                    grade = "A";
                } else if (score >= 70 && score <= 79) {
                    grade = "B";
                } else if (score >= 60 && score <= 69) {
                    grade = "C";
                } else if (score >= 50 && score <= 59) {
                    grade = "D";
                } else {
                    grade = "E";
                }
                
                pw.println(name + "," + score + "," + grade);
            }
            
            //closing the PrintWriter object
            pw.close();
        } catch (Exception e) {

            //output
            System.out.println("message to print if there is an exception");
        }
    }
}