package src.demos;
public class JobPosting {
    private String title;
    private String location;
    private double startingSalary;
    private boolean remoteAvailable;

    // Rule 1: Constructors must have a public modifier
    // Rule 2: Constructors are methods without return types
    // Rule 3: Constructors have the same name as the class
    // Rule 4: Default constructors have no parameters
    public JobPosting() {
        title = "Not defined";
        location = "Chicago, IL";
        startingSalary = 0;
        remoteAvailable = false;
    }

    public JobPosting(String title, String location, double startingSalary, boolean remoteAvailable) {
        validateStartingSalary(startingSalary);
        this.title = title;
        this.location = location;
        this.startingSalary = startingSalary;
        this.remoteAvailable = remoteAvailable;
    }

    // getter methods (aka accessor methods)
    // Rule 1: maust have the public modifier
    // Rule 2: must Return the same type as the instance variable
    //Rule 3: getter  names must start  "get" followed by the variable name written in camelCase
    // Rule 3b: if the variable is a boolean, use "is" instead of "get". 
    // Rule 4: No parameters
    // Rule 5: Always return the instance variable
    public String getTitle() {
        return this.title;
    }

    public String getLocation() {
        return this.location;
    }

    public double getStartingSalary() {
        return this.startingSalary;
    }

    // Rule 1: Use the private modifier
    // Rule 2: Return type is always void
    // Rule 3: name it "validate" followed by the name of the variable, written in camel case
    // Rule 4: a single parameter must match the instance variable
    // Rule 5: Create one or more if statement checking for bad values. If true, throw an IllegalArgumentException, passing the reason as a string argument
    private void validateStartingSalary(double startingSalary){
        if(startingSalary < 0){
            throw new IllegalArgumentException("The starting salary can't be less than 0.");
        }
    }

    public boolean isRemoteAvailable() {
        return this.remoteAvailable;
    }
}
