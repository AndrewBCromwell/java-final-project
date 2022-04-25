package chapter_assignments;
import utilitys.TaskHandler;
import utilitys.UIUtility;
import utilitys.InputUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import static java.lang.Math.PI;

import java.io.IOException;
import java.math.BigInteger;
public class Chapter5 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 4 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2"
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
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 4 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        boolean notDone = true;
        while(notDone){
            String userInput = InputUtility.getString("Enter a whole number (S to Stop)", in);
            if(userInput.equalsIgnoreCase("s")){
                notDone = false;
            } else{
                try{
                    Integer number = Integer.parseInt(userInput); // some help from "Roland" and ...
                    if(number.intValue() % 2 == 0){
                        evens.add(number);
                    } else{
                        odds.add(number);
                    }
                } catch(NumberFormatException ex){ // ... "Rob Hurska" on stackoverflow.
                    System.out.println("Not a valid input. try again.");
                }
            }
        }
        Collections.sort(evens);
        Collections.sort(odds);
        System.out.println("Even Numbers: " + evens);
        System.out.println("Odd Numbers: " + odds);
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
    }
}
    