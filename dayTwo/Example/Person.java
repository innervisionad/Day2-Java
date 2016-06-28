package dayTwo.Example;

/**
 * Created by student on 28-Jun-16.
 */
public class Person {

    //fields
    private String firstName;
    private String lastName;
    private int age;
    private boolean female;

    // properties getter and setter used to get and set values;  fields are private so this is needed
    public void setFirstName(String fn) {  this.firstName = fn; }
    public String getFirstName() { return this.firstName; }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //constructors   no return type, otherwise it becomes a method   only call when you create a new object
    public Person() {}

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // methods
    public String talk() { return null;}
    public void walk() {}

    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName;
    }

    // events,





}
