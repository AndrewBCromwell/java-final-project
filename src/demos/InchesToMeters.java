package src.demos;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        double meters;
        int inches, counter;

        counter = 0;
        for (inches = 1; inches <= 12 * 12; inches++) {
            meters = inches / 39.37; // convert to meters
            
            System.out.printf("%d inches is %.2f meters.%n", inches, meters);

            counter++;
            // every 12th line, print a blank line
            if (counter == 12) {
                System.out.println();
                counter = 0; // reset the line counter
            }
        }
    }
}
