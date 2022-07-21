package sg.edu.nus.iss.day13revision.Model;

public class Person {
    private String firstName;
    private String lastName;


    public Person() {
    }

    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    @Override
    public String toString() {
        return "{" +
        " firstName='" + getFirstName() + "'" +
        ", lastName='" + getLastName() + "'" +
        "}";
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}