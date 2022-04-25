package final_assignment.controller;

import utilitys.UIUtility;
import utilitys.InputUtility;
import utilitys.TaskHandler;
import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;        
        while (true) {
            String menuTitle = "Main Menu";
            String prompt = "Select an action";
            String[] menuOptions = {
                "Add LEGO set", "Remove LEGO set", "Show set data", "Chapter 4", "chapter 5 challenge",
                "Chapter 5"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
            }
            UIUtility.pressEnterToContinue(scanner);
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }   
}
