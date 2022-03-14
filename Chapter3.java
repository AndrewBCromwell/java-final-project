import java.util.Scanner;
import static java.lang.Math.PI;
public class Chapter3 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
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
        System.out.println("\nExiting Chapter 1 Menu.");
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
        
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        
    }
}
