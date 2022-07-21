package sg.edu.nus.iss.day13revisionproject.models;

public class Person {

    private String firstName;
    private String lastName;
    
    //constructor that takes in two strings for to set the first name and last name when the object is created
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
