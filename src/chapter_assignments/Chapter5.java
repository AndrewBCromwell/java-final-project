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
        String str1 = InputUtility.getString("Enter a string", in);
        int length1 = str1.length();
        String first3chars1 = str1.substring(0, 3);
        char lastChar1 = str1.charAt(length1 - 1);
        boolean containsI1 = str1.contains("i");
        String str1LowerCase = str1.toLowerCase();
        StringBuilder strBuilder1 = new StringBuilder(); // information found on GeeksforGeeks 'Reverse a string in Java'
        strBuilder1.append(str1LowerCase.replace(" ", ""));
        boolean isPalindrome1;
        if(strBuilder1.equals(strBuilder1.reverse())){
            isPalindrome1 = true;
        }else{
            isPalindrome1 = false;
        }
        System.out.println("**Statistics**\n" +
                            "Length: " + length1 +
                            "\nFirst 3 characters: " + first3chars1 +
                            "\nLast Character: " + lastChar1 +
                            "\nContains the letter i: " + containsI1 +
                            "\nLowercase: " + str1LowerCase +
                            "\nIs a palindrome: " + isPalindrome1 + "\n\n");

        String str2 = InputUtility.getString("Enter a string", in);
        int length2 = str2.length();
        String first3chars2 = str2.substring(0, 3);
        char lastChar2 = str2.charAt(length2 - 1);
        boolean containsI2 = str2.contains("i");
        String str2LowerCase = str2.toLowerCase();
        StringBuilder strBuilder2 = new StringBuilder(); // information found on GeeksforGeeks 'Reverse a string in Java'
        strBuilder2.append(str2LowerCase.replace(" ", ""));
        boolean isPalindrome2;
        if(strBuilder2.equals(strBuilder2.reverse())){
            isPalindrome2 = true;
        }else{
            isPalindrome2 = false;
        }
        System.out.println("**Statistics**\n" +
                            "Length: " + length2 +
                            "\nFirst 3 characters: " + first3chars2 +
                            "\nLast Character: " + lastChar2 +
                            "\nContains the letter i: " + containsI2 +
                            "\nLowercase: " + str2LowerCase +
                            "\nIs a palindrome: " + isPalindrome2 + "\n\n");

        if(str1.compareToIgnoreCase(str2) > 0){
            System.out.println(str2 + " comes alpabetically before " + str1);
        }else if(str1.compareToIgnoreCase(str2) < 0){
            System.out.println(str1 + " comes alpabetically before " + str2);
        }else{
            System.out.println("The strings are the same.");
        }
    }
}
    