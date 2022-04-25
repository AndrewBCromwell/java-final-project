package demos;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person() {
        firstName = "Undefined";
        lastName = "Undefined";
    }

    public Person(String firstName, String lastName) {
        validateFirstName(firstName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        validateFirstName(firstName);
        this.firstName = firstName;
    }

    private void validateFirstName(String firstName) {
        if(firstName == null || firstName.equals("")) {
            throw new IllegalArgumentException("First name is required");
        }
    }

    @Override
    public String toString() {
        String result = String.format("First name: %s%nLast name: %s%n%n", firstName, lastName);
        return result;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int result = this.lastName.compareTo(otherPerson.lastName);
        if(result == 0){
            result = this.firstName.compareTo(otherPerson.firstName);
        }
        return result;
    }
}
