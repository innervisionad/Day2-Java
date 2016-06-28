package dayTwo.AddressBookProgram;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by student on 28-Jun-16.
 */
public class Program
{
    static AddressBook book = new AddressBook();

    public static void main (String[] args)
    {



            int choice;
            do{
                System.out.println("Welcome to Awesome Address Book!");
                System.out.println("1. Add a new contact");
                System.out.println("2. Edit a contact");
                System.out.println("3. Sort contacts");
                System.out.println("4. Remove contact");
                System.out.println("5. Exit");
                System.out.println("Choose an option: ");

                Scanner scan = new Scanner(System.in);
                choice = scan.nextInt();
                System.out.println();

            }while (choice  < 1 || choice > 5 );

            switch(choice){
                case 1:
                    getDetails();
                    break;
                case 2:
                    editDetails();
            }


    }

    static void getDetails() {
        String firstName, lastName, email, phoneNumber, address;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter first Name: ");
        firstName = s.nextLine();

        System.out.println("Enter last Name: ");
        lastName = s.nextLine();

        System.out.println("Enter address: ");
        address = s.nextLine();
        String[] data = address.split (",");

        System.out.println("Enter phone number: ");
        phoneNumber = s.nextLine();

        System.out.println("Enter email: ");
        email = s.nextLine();

        book.addNewContact(firstName, lastName, new Address(data[0], data[1], data[2], data[3]), phoneNumber, email);

        for(Contact c : book.getContacts()) {
            if(c != null)
            System.out.println(c.getPerson().getFirstName());
        }

    }

    static void editDetails() {
        



    }

}
