package final_assignment.controller;

import utilitys.UIUtility;
import utilitys.InputUtility;
import utilitys.TaskHandler;
import java.util.Scanner;

import final_assignment.model.DisplayShelf;

public class MainFinal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;  
        DisplayShelf displayShelf = new DisplayShelf();
        
        while (true) {
            String menuTitle = "Main Menu";
            String prompt = "Select an action";
            String[] menuOptions = {
                "Add LEGO set", "Remove LEGO set", "Show set data", "Update data", 
                "Sort LEGO sets", "Change order", "Replace LEGO set", "Total pieces"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    displayShelf.addSet(scanner);
                    break;
                case 2:
                    displayShelf.removeSet(scanner);
                    break;
                case 3:
                    displayShelf.showSetData();
                    break;
                case 4:
                    displayShelf.selectUpdateIndex(scanner);
                    break;
                case 5:
                    displayShelf.selectSortType(scanner);
                    break;
                case 6:
                    displayShelf.changeOrder(scanner);
                    break;
                case 7:
                    displayShelf.replaceSet(scanner);
                    break;
                case 8:
                    displayShelf.totalPieces();
                    break;
            }
            UIUtility.pressEnterToContinue(scanner);
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }   
}
