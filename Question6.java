import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //asking the user to enter a number from 1 to 7
        System.out.print("Enter a number from 1 to 7: ");
        int day = input.nextInt();
        
        //using switch statement to determine the day of the week
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
    }
}