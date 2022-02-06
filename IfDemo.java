import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        int heightInInches = 75;
        if (heightInInches >= 45) {
            System.out.println("You can ride the rollercoaster!");
        }

        String name1 = "Marc";
        String name2 = "Marc";

        if(name1.equals(name2)) {
            System.out.println("We've got 2 Marcs!");
        }

        int num1 = 5 , num2 = 6;
        if (num1 == 5 && num2 == 6) {
            System.out.println("you can assign 2 variables on the same line");
        }

        for(int i = 10; i >= 0; i -= 2) {
            System.out.println(i);

        }

        int score = 10;
        System.out.println(score++);
        System.out.println(++score);
    }
}
