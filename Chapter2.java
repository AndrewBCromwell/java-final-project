import java.util.Scanner;
import  java.math.RoundingMode;
import java.math.BigDecimal;

public class Chapter2 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
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
        System.out.println(RoundingMode.FLOOR);
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        
    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Exercise 4");
        
    }
}


    

