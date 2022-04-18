package src.chapter_assignments;
import src.utilitys.TaskHandler;
import src.utilitys.UIUtility;
import src.utilitys.InputUtility;
import java.util.Scanner;
import static java.lang.Math.PI;
import java.lang.NumberFormatException;
import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class Chapter3 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 3 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3"
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
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 3 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        int num1 = InputUtility.getInt("Enter a number", in);
        int num2 = InputUtility.getInt("Enter another number", in);
        int count;
        if (num1 <= num2){
            if (num1 % 2 != 0){
                count = num1 + 1;
            } else{
                count = num1 + 2;
            }
            if (count >= num2){
                System.out.printf("No even numbers %d and %d.%n", num1, num2);
            } else{
                while (count < num2){
                    System.out.print(count + " ");
                    if(count % num1 == 0 && count != 0){
                        break;
                    }
                    count += 2;
                }
                System.out.println();
            }
        } else if(num1 > num2){
            if (num1 % 2 != 0){
                count = num1 - 1;
            } else{
                count = num1 - 2;
            }
            if (count <= num2){
                System.out.printf("No even numbers %d and %d.%n", num1, num2);
            } else{
                while (count > num2){
                    System.out.print(count + " ");
                    if(count % num2 == 0 && count != 0){
                        break;
                    }
                    count -= 2;
                }
                System.out.println();
            }
        }
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        double avg = 0;
        int sum = 0;
        int count = 0;
        boolean more = true;
        while(more){
            String userInput = InputUtility.getString("Enter a whole number (S to stop)", in);
            try{
                int number = Integer.parseInt(userInput);
                sum += number;
                if(number > highest){
                    highest = number;
                }
                if(number < lowest){
                    lowest = number;
                }
                count++;
            }catch(NumberFormatException e){
                if(userInput.equalsIgnoreCase("S") || userInput.equalsIgnoreCase("Stop")){
                    more = false;
                } else{
                    System.out.println("Invalid input. Try again.");
                    continue;
                }
            }
        }
        if(count != 0){
            avg = (double)sum / count;
        }
        System.out.println("You entered " + count + " numbers.");
        System.out.println("The sum of the numbers is " + sum + ".");
        System.out.println("The largest number is " + highest + ".");
        System.out.println("The smallest number is " + lowest + ".");
        System.out.printf("The average of the numbers is %.2f.%n", avg);
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        int rand1 = ThreadLocalRandom.current().nextInt(1, 12 + 1);
        int rand2 = ThreadLocalRandom.current().nextInt(1, 12 + 1);
        int answer = rand1 * rand2;
        int guesses = 3;
        while(guesses > 0){
            int userInput = InputUtility.getInt("What is " + rand1 + " X " + rand2 + "?", in);
            if(userInput == answer){
                System.out.println("Correct!");
                break;
            } else{
                guesses--;
                if(guesses > 0){
                    System.out.println("Incorrect. You have " + guesses + " guesses left.");
                } else{
                    System.out.println("Incorrect. the answer was " + answer + ".");
                }
            }
        }
    }
}
