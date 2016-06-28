package dayTwo.Example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import static dayTwo.Example.PersonCreation.*;
/**
 * Created by student on 28-Jun-16.
 */
public class Program {
    //collect then print

    public static void main(String[] args) {
        //Collection sets a collection, the ArrayList is the type.. can be changed. collection supports looping(foreach and iterator)
        Collection<Person> people = new ArrayList<>();
        people.add(alex);
        PersonCreation.setPerson();
        people.add(john);

        for(Person p : people)
        {
            System.out.println(p);
        }
    }
}
