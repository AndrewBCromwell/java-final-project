package demos;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Zodiac {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthday (YYYY-MM-DD): ");
        String birthday = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate yourBirthday;
        while (true) {
            try {
                yourBirthday = LocalDate.parse(birthday, formatter);
                break;
            } catch(DateTimeParseException e) {
                System.out.println("Invalid date. Try again.");
                System.out.print("Enter your birthday (YYYY-MM-DD): ");
                birthday = scanner.nextLine();
            }
        }
        scanner.close();
        Month _month = yourBirthday.getMonth() ;
        // String month = "January";
        // switch (_month)
        // {
        //     case JANUARY:
        //         month = "January";
        //         break;
        //     case FEBRUARY:
        //         month = "February";
        //         break
        // }
        int day = yourBirthday.getDayOfMonth() ;
        String month = _month.toString();
        String sign = "";
        month = month.toLowerCase();
        System.out.print(month);
        
        if (month == "january") {
            if (day < 20)
               sign = "Capricorn";
            else
               sign = "Aquarius";
         }
         else if (month == "febuary") {
            if (day < 19)
               sign = "Aquarius";
            else
               sign = "Pisces";
         }
         else if(month == "march") {
            if (day < 21)
               sign = "Pisces";
            else
               sign = "Aries";
         }
         else if (month == "april") {
            if (day < 20)
               sign = "Aries";
            else
               sign = "Taurus";
         }
         else if (month == "may") {
            if (day < 21)
               sign = "Taurus";
            else
               sign = "Gemini";
         }
         else if( month == "june") {
            if (day < 21)
               sign = "Gemini";
            else
               sign = "Cancer";
         }
         else if (month == "july") {
            if (day < 23)
               sign = "Cancer";
            else
               sign = "Leo";
         }
         else if( month == "august") {
            if (day < 23)
               sign = "Leo";
            else
               sign = "Virgo";
         }
         else if (month == "september") {
            if (day < 23)
               sign = "Virgo";
            else
               sign = "Libra";
         }
         else if (month == "october") {
            if (day < 23)
               sign = "Libra";
            else
               sign = "Scorpio";
         }
         else if (month == "november") {
            if (day < 22)
               sign = "scorpio";
            else
               sign = "Sagittarius";
         }
         else if (month == "december") {
            if (day < 22)
               sign = "Sagittarius";
            else
               sign ="Capricorn";
         }
         System.out.println("your Sign is " + sign);
    }
}
