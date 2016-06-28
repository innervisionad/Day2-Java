package dayTwo.Example;

/**
 * Created by student on 28-Jun-16.
 */
public class PersonCreation {
    //byte i = 0  value type = variables stored in same place as value
    //reference type: variable is a reference to the storage.
    final static Person alex = new Person ();
    final static Person john = new Person ("John", "Doe");

    static void setPerson()
    {
        alex.setFirstName("Alex");
        alex.setLastName("Kennedy");
    }








}
