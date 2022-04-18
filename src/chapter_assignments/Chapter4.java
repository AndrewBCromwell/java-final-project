package src.chapter_assignments;
import java.util.Scanner;
import static java.lang.Math.PI;
import src.utilitys.TaskHandler;
import src.utilitys.UIUtility;
import src.utilitys.InputUtility;
import java.io.IOException;
import java.math.BigInteger;
public class Chapter4 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 4 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4", 
                "Exercise 5", "Exercise 6", "Exercise 7", "Exercise 8"
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
                case 4:
                    exercise4(in);
                    break;
                case 5:
                    exercise5(in);
                    break;
                case 6:
                    exercise6(in);
                    break;
                case 7:
                    exercise7(in);
                    break;
                case 8:
                    exercise8(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 4 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        Fraction fraction = new Fraction();
        System.out.println(fraction);
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        Fraction fraction  = new Fraction(27, 6);
        System.out.println(fraction);
        System.out.println(fraction.getNumerator());
        System.out.println(fraction.getDenominator());
        fraction.setNumerator(30);
        fraction.setDenominator(45);
        System.out.println(fraction);
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        try{
            Fraction fraction = new Fraction(3, 0);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        Fraction fraction = new Fraction();
        try{
            fraction.setDenominator(0);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Exercise 4");
        System.out.println(Fraction.greatestCommonDivisor(75, 45));
        System.out.println(Fraction.greatestCommonDivisor(2, 4));
        System.out.println(Fraction.greatestCommonDivisor(5, 7));
    }
    
    public void exercise5(Scanner in) {
        UIUtility.showMenuTitle("Exercise 5");
        Fraction fraction1 = new Fraction(75, 45);
        System.out.println(fraction1.simplify());
        Fraction fraction2 = new Fraction(2, 4);
        System.out.println(fraction2.simplify());
        Fraction fraction3 = new Fraction(5, 7);
        System.out.println(fraction3.simplify());
        Fraction fraction4 = new Fraction(-2, 4);
        System.out.println(fraction4.simplify());
        Fraction fraction5 = new Fraction(2, -4);
        System.out.println(fraction5.simplify());
        Fraction fraction6 = new Fraction(-2, -4);
        System.out.println(fraction6.simplify());
    }

    public void exercise6(Scanner in) {
        UIUtility.showMenuTitle("Exercise 6"); 
        Fraction fraction1 = new Fraction(4, 1);
        System.out.println(fraction1.mixedNumber());
        Fraction fraction2 = new Fraction(0, 4);
        System.out.println(fraction2.mixedNumber());
        Fraction fraction3 = new Fraction(4, 4);
        System.out.println(fraction3.mixedNumber());
        Fraction fraction4 = new Fraction(8, 4);
        System.out.println(fraction4.mixedNumber());
        Fraction fraction5 = new Fraction(4, 8);
        System.out.println(fraction5.mixedNumber());
        Fraction fraction6 = new Fraction(13, 5);
        System.out.println(fraction6.mixedNumber());
        Fraction fraction7 = new Fraction(-13, 5);
        System.out.println(fraction7.mixedNumber());
        Fraction fraction8 = new Fraction(13, -5);
        System.out.println(fraction8.mixedNumber());
        Fraction fraction9 = new Fraction(-13, -5);
        System.out.println(fraction9.mixedNumber());
    }

    public void exercise7(Scanner in) {
        UIUtility.showMenuTitle("Exercise 7");
        Fraction fraction1 = new Fraction(13, 5);
        Fraction fraction2 = new Fraction(4, 8);
        System.out.println(fraction1.add(fraction2));
        Fraction fraction3 = new Fraction(-13, -5);
        Fraction fraction4 = new Fraction(13, -5);
        System.out.println(fraction3.add(fraction4));
    }

    public void exercise8(Scanner in) {
        UIUtility.showMenuTitle("Exercise 8");
        boolean needed = true;
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();
        int numerator1 = InputUtility.getInt("Enter the numerator of the first fraction to add", in);
        while(needed){
            try{
                int denominator1 = InputUtility.getInt("Enter the denominator of the first fraction to add", in);
                fraction1 = new Fraction(numerator1, denominator1);
                needed = false;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage() + " Try again.");
            }
        }
        needed = true;
        int numerator2 = InputUtility.getInt("Enter the numerator of the second fraction to add", in);
        while(needed){
            try{
                int denominator2 = InputUtility.getInt("Enter the denominator of the second fraction to add", in);
                fraction2 = new Fraction(numerator2, denominator2);
                needed = false;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage() + " Try again.");
            }
        }
        System.out.println(fraction1.add(fraction2));
    }
}

class Fraction{
    private int numerator;
    private int denominator;

    public Fraction(){
        numerator = 1;
        denominator = 1;
    }
    
    public Fraction(int numerator, int denominator){
        validateDenominator(denominator);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setDenominator(int denominator){
        validateDenominator(denominator);
        this.denominator = denominator;
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

    private void validateDenominator(int denominator) throws IllegalArgumentException{
        if (denominator == 0){
            throw new IllegalArgumentException("Denominator can not equal zero.");
        }
    }

    public static int greatestCommonDivisor(int num1, int num2){
        // from stack overflow, answer by Tony Ennis and Ry-
        BigInteger b1 = BigInteger.valueOf(num1);
        BigInteger b2 = BigInteger.valueOf(num2);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    public Fraction simplify(){
        Fraction simplifiedFraction = new Fraction();
        int gcd = greatestCommonDivisor(numerator, denominator);
        if((numerator > 0 && denominator < 0) || (numerator < 0 && denominator < 0)){ 
            simplifiedFraction.setNumerator(numerator / gcd * -1);
            simplifiedFraction.setDenominator(denominator / gcd * -1);
        } else{
            simplifiedFraction.setNumerator(numerator / gcd);
            simplifiedFraction.setDenominator(denominator / gcd);
        }
        return simplifiedFraction;
    }

    public String mixedNumber(){
        String mixedNumber = "";
        Fraction simplifiedFraction = simplify();
        if(simplifiedFraction.getDenominator() == 1){
            mixedNumber = mixedNumber + simplifiedFraction.getNumerator();
        } else if(simplifiedFraction.getNumerator() == 0){
            mixedNumber = mixedNumber + 0;
        } else if(simplifiedFraction.getNumerator() > simplifiedFraction.getDenominator() && simplifiedFraction.getNumerator() > 0){ // positive fraction
            int intPart = simplifiedFraction.getNumerator() / simplifiedFraction.getDenominator();
            Fraction fractionPart = new Fraction(simplifiedFraction.getNumerator() - (intPart * simplifiedFraction.getDenominator()), simplifiedFraction.getDenominator());
            mixedNumber = mixedNumber + intPart + " " + fractionPart.toString();
        } else if(simplifiedFraction.getNumerator() < simplifiedFraction.getDenominator() && simplifiedFraction.getNumerator() < 0){ // negative fraction
            int intPart = simplifiedFraction.getNumerator() / simplifiedFraction.getDenominator();
            Fraction fractionPart = new Fraction((simplifiedFraction.getNumerator() * -1) + (intPart * simplifiedFraction.getDenominator()), simplifiedFraction.getDenominator());
            mixedNumber = mixedNumber + intPart + " " + fractionPart.toString();
        } else{ // numerator less than denominator, i.e. proper fraction
            mixedNumber = simplifiedFraction.toString();
        }
        return mixedNumber;
    }

    public String add(Fraction other){
        String returString;
        Fraction sum = new Fraction((this.getNumerator() * other.getDenominator() + other.getNumerator() * this.getDenominator()), (this.getDenominator() * other.getDenominator()));
        returString = this.mixedNumber() + " + " + other.mixedNumber() + " = " + sum.mixedNumber();
        return returString; 
    }
    
}