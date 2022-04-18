package src.demos;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class IfDemo {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in);
        char answer;
        for(int i = 0; i < 100; i++) {
            answer = (char)ThreadLocalRandom.current().nextInt(65, 91);
            char guess;
            while(true) {
                guess = scanner.nextLine().toUpperCase().charAt(0);
                while(guess < 65 || guess > 90) {
                    System.out.println("Invalid input");
                    System.out.print("Guess a letter: ");
                    guess = scanner.nextLine().toUpperCase().charAt(0);
                }
                if(guess == answer){
                    System.out.println("that's correct");
                    break;
                } else if (guess < answer){
                    System.out.println("Incorrect. Go higher.");
                } else {
                    System.out.println("Incorect. Go lower");
                }
            }
        }
    }
}
