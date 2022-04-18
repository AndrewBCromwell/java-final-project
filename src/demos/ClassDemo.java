package src.demos;
import java.util.Scanner;

class Item { // singular, starts with capital
    double price; // instance variable or field
    String name;
}

class TaxableItem extends Item { // inheritence
    double taxPercent = 0.06;
}

class NonTaxableItem extends Item {
    double taxPercent = 0.0;
}

public class ClassDemo { // When multiple classes in same file, only one can be public and that is the one with the same name as the file.
    public static void main(String[] args) {

        // instantiate a JobPosting object using the default values
        JobPosting job1 = new JobPosting();
        System.out.println(job1.getTitle());
        System.out.println(job1.getLocation());
        System.out.println(job1.getStartingSalary());
        System.out.println(job1.isRemoteAvailable());

        JobPosting job2 = null;
        try{
            job2 = new JobPosting("Revenue Cycle Representative", "Scottsbluff, NE", 40000, true);
            System.out.println(job2.getTitle());
            System.out.println(job2.getLocation());
            System.out.println(job2.getStartingSalary());
            System.out.println(job2.isRemoteAvailable());
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        
        

        // Item cherryDonut = new Item();
        // Item coffee = new Item(); //  instantiate multiple items
        // cherryDonut.price = 1.25;
        // cherryDonut.name = "Cherry Donut"; // will not hard code values later.
        // coffee.price = 2;
        // coffee.name = "Cup of coffee";
        // System.out.printf("A dozen %ss costs $%.2f%n", cherryDonut.name, cherryDonut.price * 12);
        // System.out.printf("A dozen %ss costs $%.2f%n", coffee.name, coffee.price * 12);

        // Item donut = new Item();
        // donut.name = "Cherry donut";
        // donut.price = 1.25;
        // Item donut2 = donut; // this creates reference to same objects ...
        // System.out.println(donut.name + " " + donut.price);
        // System.out.println(donut2.name + " " + donut2.price);
        // donut.name = "Blueberry donut";
        // donut.price = 1.5; // ... so these affect both
        // System.out.println(donut.name + " " + donut.price);
        // System.out.println(donut2.name + " " + donut2.price);
    }
}