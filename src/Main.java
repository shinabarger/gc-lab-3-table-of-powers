import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by davidshinabarger on 1/31/17.
 */
public class Main {
    public static void main(String[] args) {
        String numberHeader = "User Number";
        String squaredHeader = "Number Squared";
        String cubedHeader = "Number Cubed";
        Scanner scan = new Scanner(System.in);
        int userNumber = 0;
        int squaredNumber = 0;
        int cubedNumber = 0;
        String keepGoing = " ";
        int start = 1;
        int squaredStart = 0;
        int cubedStart = 0;


        do {
            System.out.println("Please enter a number: ");
        userNumber = scan.nextInt();
        squaredNumber = (int) Math.pow(userNumber, 2);
        cubedNumber = (int) Math.pow(userNumber, 3);
        scan.nextLine();

        //outprint using formatter to make table (http://www.homeandlearn.co.uk/java/java_formatted_strings.html)
        System.out.printf("%-15s %s %15s %n", numberHeader, squaredHeader, cubedHeader);
        System.out.println("______________________________________________");
        for(start=1; start <= userNumber; start++){
            squaredStart = (int) Math.pow(start, 2);
            cubedStart = (int) Math.pow(start, 3);
                System.out.printf("%-15s %s %20s %n", start, squaredStart, cubedStart);
            }
        System.out.println("would you like to continue? Enter yes or no.");
            keepGoing = scan.nextLine();

        } while (keepGoing.equalsIgnoreCase("yes"));

        System.out.println("Okay. See you later. I'll see myself out.");

        /**QUESTION: How to save output from first do loop so that in the second time
         *  thru the do loop that it prints both the 1st print output AND the second output
         *  will this work? http://stackoverflow.com/questions/8708342/redirect-console-output-to-string-in-java
          */



    }
}
