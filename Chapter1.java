import java.util.Scanner;
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
        // Your code here
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        // Your code here
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        // Your code here
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