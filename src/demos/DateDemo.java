package src.demos;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.sound.midi.Synthesizer;

public class DateDemo {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthday (ex: January 1, 1979): ");
        String birthday = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        LocalDate yourBirthday;
        while (true) {
            try {
                yourBirthday = LocalDate.parse(birthday, formatter);
                break;
            } catch(DateTimeParseException e) {
                System.out.println("Invalid date. Try again.");
                System.out.print("Enter your birthday (ex: January 1, 1970): ");
                birthday = scanner.nextLine();
            }
        }
        scanner.close();
        System.out.println(yourBirthday.getDayOfWeek());

        
        // LocalDate today = LocalDate.now();
        // LocalDate springBreakStarts = LocalDate.of(2022, 3, 11);
        // Period daysUntill = today.until(springBreakStarts);
        // System.out.println(daysUntill.getDays());
    }
}