package chapter_assignments;
import utilitys.UIUtility;
import utilitys.InputUtility;
import utilitys.TaskHandler;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;        
        while (true) {
            String menuTitle = "Main Menu";
            String prompt = "Select an chapter";
            String[] menuOptions = {
                "Chapter 1", "Chapter 2", "Chapter 3", "Chapter 4", "chapter 5 challenge",
                "Chapter 5"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    new Chapter1().handleTask(scanner);
                    break;
                case 2:
                    new Chapter2().handleTask(scanner);
                    break;
                case 3:
                    new Chapter3().handleTask(scanner);
                    break;
                case 4:
                    new Chapter4().handleTask(scanner);
                    break;
                case 5:
                    new Chapter5Challenge().handleTask(scanner);
                    break;
                case 6:
                    new Chapter5().handleTask(scanner);
            }
            UIUtility.pressEnterToContinue(scanner);
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }   
}