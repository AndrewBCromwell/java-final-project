import java.util.Scanner;
import static java.lang.Math.PI;
public class Chapter1 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Sample Exercise"
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
                    sampleExercise(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 1 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxx\nx Get Largest Number x\n"
                            + "xxxxxxxxxxxxxxxxxxxxxx\n");
        double firstNumber = InputUtility.getDouble("Enter a number: ", in);
        double secondNumber = InputUtility.getDouble("Enter another number: ", in);
        if ( firstNumber > secondNumber) {
            System.out.println("The larger number is: " + firstNumber);
        }
        else {
            System.out.println("The larger number is: " + secondNumber);
        }
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        System.out.println("xxxxxxxxxxxxxxx\nx Get Average x\nxxxxxxxxxxxxxxx\n");
        double firstNumber = InputUtility.getDouble("Enter a number: ", in);
        double secondNumber = InputUtility.getDouble("Enter another number: ", in);
        double average = (firstNumber + secondNumber) / 2;
        System.out.printf("The average is %.1f", average);
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx\nx Get Area of a Circle x\n" +
                            "xxxxxxxxxxxxxxxxxxxxxxxx");
        double radius = InputUtility.getDouble("Enter the radius: ", in);
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;
        System.out.printf("The circumference is %.2f, and the area is %.2f.", circumference, area);
    }

    public void sampleExercise(Scanner in) {
        UIUtility.showMenuTitle("Sample Exercise");
        String name = InputUtility.getString("What is your name? ", in);
        System.out.printf("Hello, %s!%n", name);

        int favNum = InputUtility.getInt("What is your favorite number? ", in);
        System.out.printf("Your favorite number is %d.%n", favNum);

        int age = InputUtility.getIntInRange("What is your age? ", 0, 120, in);
        System.out.printf("You are %d years old.%n", age);

        double rainfall = InputUtility.getDouble("How much did it rain yesterday? ", in);
        System.out.printf("It rained %.1f inches yesterday.%n", rainfall);

        String favFood = InputUtility.validateUserString("What is your favorite food?", new String[]{"Pizza", "Sushi", "Ice Cream"}, in);
        if(favFood.toLowerCase().equals("pizza")) {
            System.out.println("I like pizza too!");
        } else if(favFood.toLowerCase().equals("sushi")) {
            System.out.println("That's gross!");
        } else {
            System.out.println("It's too cold for that!");
        }
    }
}
