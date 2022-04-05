import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


class Donation {
    private double amount;
    private String note;
    private String person;
    private LocalDate dateDonated;
    static double totalDonations = 0; // shared among all donations

    public Donation(){
        amount = 0;
        note = "I donated in support of this campain.";
        person = "anonymous";
        dateDonated = LocalDate.now();
    }

    public Donation(double amount, String note, String person, LocalDate dateDonated) {
        validateAmount(amount);
        this.amount = amount;
        this.note = note;
        this.person = person;
        this.dateDonated = dateDonated;
    }

    public double getAmount(){
        return amount;
    }

    public String getPerson() {
        return person;
    }

    public String getNote() {
        return note;
    }

    public LocalDate getDateDonated() {
        return dateDonated;
    }

    public void setAmount(double amount){
        validateAmount(amount);
        this.amount = amount;
    }

    public void setPerson(String person){
        this.person = person;
    }

    public void setNote(String note){
        this.note = note;
    }

    public void setDateDonated(LocalDate dateDonated){
        this.dateDonated = dateDonated;
    }

    private void validateAmount(Double amount){
        if(amount < 5 || amount > 10000000){
            throw new IllegalArgumentException("Your donation must be between $5 and $10,0000,000");
        }
    }

    @Override
    public String toString() { // caled when printed
        return String.format("%s donated $%.2f: \"%s\"", person, amount, note);
    }

    void daysAgo(){
        LocalDate today = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(dateDonated, today);
        if(daysBetween == 1) {
            System.out.println("This donation was made yesterday.");
        } else {
        System.out.println("This donation was made " + daysBetween + " days ago.");
        }
    }
}

class Person {
    String name;
}


public class MethodDemo {
    public static void main(String[] args) {
        ArrayList<Donation> donations = new ArrayList<>();
        donations.add(new Donation(50, "In suport", "Andy", LocalDate.now()));


        Scanner sc = new Scanner(System.in);
        Donation donation = new Donation();
        while(true){
            System.out.print("How much would you like to donate? ");
            double donationAmt = 0;
            try{
                donationAmt = sc.nextDouble();
                sc.nextLine();
            } catch(InputMismatchException ex){
                sc.nextLine();
                System.out.println("Please select or enter a donation amount. Include only digits and a decimal place (i.e. 25 or 37.50). Do not enter commas or a $.");
                continue;
            }
            try{
                donation.setAmount(donationAmt);
            }catch(IllegalArgumentException e){
                System.out.println("invalid amount");
                System.out.println(e.getMessage());
                continue;
            }
            break;

        }
        System.out.println(donation);
        sc.close();
    }
}
