import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;



public class test {
    public static void main(String[] args) {
        // BigDecimal ten = new BigDecimal("10");
        // BigDecimal three = new BigDecimal("3");
        // BigDecimal result;
        // try {
        //     result = ten.divide(three);
        // } catch(ArithmeticException e){
        //     result = ten.divide(three, 5, RoundingMode.HALF_UP);
        // }
         
        // System.out.println(result);
        // System.out.println(ten.remainder(three));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter");
        char userInput = scanner.nextLine().charAt(0);
        if (userInput >= 65 && userInput <= 90){
            System.out.println("" + (userInput += 32)); ;
        } else if (userInput >= 97 && userInput <= 122) {
            System.out.println("" + (userInput -= 32));
        } else{
            System.out.println("invalid input.");
        }

    }
    
}
