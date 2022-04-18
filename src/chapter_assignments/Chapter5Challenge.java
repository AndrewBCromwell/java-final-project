package src.chapter_assignments;
import scr.utilitys.TaskHandler;
import src.utilitys.UIUtility;
import scr.utilitys.InputUtility;
import java.util.Scanner;
import java.util.Arrays;
public class Chapter5Challenge implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 5 Challenge Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Task 1", "Task 2", "Task 3", "Task 4", "Task 5", "Task 6",
                    "Task 7"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    task1(in);
                    break;
                case 2:
                    task2(in);
                    break;
                case 3:
                    task3(in);
                    break;
                case 4:
                    task4(in);
                    break;
                case 5:
                    task5(in);
                    break;
                case 6:
                    task6(in);
                    break;
                case 7:
                    task7(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 5 Challenge Menu.");
    }
    
    public Integer[] getRandomIntegerArray() {
        int min = 5;
        int max = 10;
        int randomSize = min + (int) (Math.random() * ((max - min) + 1));
        Integer[] list = new Integer[randomSize];
        for (int i = 0; i < randomSize; i++) {
            list[i] = (int)(Math.random() * 10);
        }
        return list;
    }

    public void task1(Scanner in) {
        UIUtility.showMenuTitle("Task 1");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));
        
        int pointOfUpdate = InputUtility.getIntInRange("Enter the point to update between 0 and " + (list.length - 1), 0, list.length - 1, in);
        int userint = InputUtility.getInt("Enter a number to update the location to: ", in);
        list[pointOfUpdate] = userint;
        

        System.out.println("Modified list: " + Arrays.toString(list));
    }

    public void task2(Scanner in) {
        UIUtility.showMenuTitle("Task 2");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));
        
        int usernumb1 = InputUtility.getIntInRange("select an index", 0, list.length-1, in);
        int usernumb2 = InputUtility.getInt("give me a number", in );
        for(int i = list.length -1 ; i > - usernumb1; i-- ){
            list[i] = list[i -1];
        }
        list[usernumb1] = usernumb2;

        System.out.println("Modified list: " + Arrays.toString(list));
    }

    public void task3(Scanner in) {
        UIUtility.showMenuTitle("Task 3");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));
        
        int pointOfDelete = InputUtility.getIntInRange("Enter the point to delete between 0 and " + (list.length - 1), 0, list.length -1, in);
        list[pointOfDelete] = null;

        System.out.println("Modified list: " + Arrays.toString(list));
    }

    public void task4(Scanner in) {
        UIUtility.showMenuTitle("Task 4");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));

        int pointOfSwap1 = InputUtility.getIntInRange("Enter the point to swap between 0 and " + (list.length - 1), 0, list.length - 1 , in);
        int pointOfSwap2 = InputUtility.getIntInRange("Enter another the point to Swap between 0 and " + (list.length - 1), 0, list.length - 1 , in);
        int temp = list[pointOfSwap1];
        list[pointOfSwap1] = list[pointOfSwap2];
        list[pointOfSwap2] = temp;
        
        
        System.out.println("Modified list: " + Arrays.toString(list));
    }

    public void task5(Scanner in) {
        UIUtility.showMenuTitle("Task 5");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));
        
        int temp = list[list.length - 1];
        for(int i = list.length - 2; i > -1  ;i-- ){
            list[i + 1] = list[i];               
        }
        list[0] = temp;

        System.out.println("Modified list: " + Arrays.toString(list));
    }

    public void task6(Scanner in) {
        UIUtility.showMenuTitle("Task 6");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));
       
        int temp = list[0];
        for(int i = 1; i < list.length  ;i++ ){
            list[i - 1] = list[i];               
        }
        list[list.length - 1] = temp;

        System.out.println("Modified list: " + Arrays.toString(list));
    }

    public void task7(Scanner in) {
        UIUtility.showMenuTitle("Task 7");
        Integer[] list = getRandomIntegerArray();
        System.out.println("Original list: " + Arrays.toString(list));
        // we got the idea to make a new array from the group sitting next to us with chris in it.
        int[] newArray = new int[list.length];
        for (int i  = 0; i < list.length ; i++){
            newArray[i] = list[list.length -1 - i];
        }

        System.out.println("Modified list: " + Arrays.toString(newArray));
    }
}
