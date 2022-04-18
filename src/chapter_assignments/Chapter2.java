package src.chapter_assignments;
import src.utilitys.TaskHandler;
import src.utilitys.UIUtility;
import src.utilitys.InputUtility;
import java.util.Scanner;
import  java.math.RoundingMode;
import java.math.BigDecimal;

public class Chapter2 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 2 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    exercise1(in);
                    break;
                case 2:
                    exercise2(in);
                    break;
                case 3:
                    exercise3(in);
                    break;
                case 4:
                    exercise4(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 1 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        int userNumber = InputUtility.getInt("Enter a whole number:", in);
        if (userNumber % 2 == 0){
            System.out.println("Your number is Even.");
        } else {
            System.out.println("Your number is Odd.");
        }
        
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        BigDecimal userNumber = new BigDecimal(InputUtility.getDouble("Enter a decimal number:", in));
        BigDecimal intPart = new BigDecimal(userNumber.intValue());
        BigDecimal multiplicand = new BigDecimal(100);
        int firstTwoDecimalPlaces = userNumber.subtract(intPart).multiply(multiplicand).intValue();
        System.out.println(intPart);
        System.out.println(firstTwoDecimalPlaces);

    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        for (int i = 2; i <= 100; i++){
            boolean isPrime = true;
            for (int j = 2; j <= 100; j++){
                if (i % j == 0 && (double)i / j != 1.0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Exercise 4");
        final int DAYS_CONVERSION = 86400;
        final int HOURS_CONVEERSION = 3600;
        final int MINUTES_CONVERSION = 60;
        int seconds = InputUtility.getIntInRange("Enter a number of seconds: ", 
                        0, Integer.MAX_VALUE, in);
        int days = seconds / DAYS_CONVERSION;
        if(days > 0){
        seconds %= days * DAYS_CONVERSION;
        }
        int hours = seconds / HOURS_CONVEERSION;
        if(hours > 0){
        seconds %= hours * HOURS_CONVEERSION;
        }
        int minutes = seconds / MINUTES_CONVERSION;
        if(minutes > 0){
        seconds %= minutes * MINUTES_CONVERSION;
        }
        System.out.printf("%d days, %d hours, %d minutes, %d seconds %n", 
                        days, hours, minutes, seconds);
    }
}


    

