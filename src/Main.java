import java.util.Random;
import java.util.Scanner;


// create an application that can be used to test the PhoneBook class
//the application should have a menu that allows the user to add, remove, and get the phone book
//the application should have a menu that allows the user to add, remove, and get the diary
// the application should allow the user to go back to the main menu after each action
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook("PhoneBook");

        String Menu = """
                1. Add Contact
                2. Remove Contact
                3. Check Amount Of Contact
                4. View Contact
                5. Exit
                """;
        System.out.println(Menu);

        int userResponse = input.nextInt();
        switch (userResponse) {
            case 1 -> {
                System.out.println("Enter a name");
                String name = input.next();
                System.out.println("Enter a phone number");
                String phoneNumber = input.next();
                System.out.println("Enter the email");
                String email = input.next();
                phoneBook.addContact(name, phoneNumber);
                System.out.println("Loading...");
                System.out.println("Contact added");
                // go back to the menu


                System.out.println("Do you want to Continue (y/n)");
                String answer = input.next();
                if (answer.equals("y")) {
                    main(args);

                } else {
                    System.out.println("Thank you for using the phonebook");
                    System.exit(0);
                }



            }
            // delete contact
             case 2-> {
                System.out.println("Enter a name");
                String name = input.next();
                System.out.println("Enter a phone number");
                String phoneNumber = input.next();
                System.out.println("Enter the email");
                String email = input.next();
                phoneBook.removeContact(name, phoneNumber);
                System.out.println("Loading...");
                System.out.println("Contact removed");
                // go back to the menu



                 System.out.println("Do you want to Continue (y/n)");
                 String answer = input.next();
                 if (answer.equals("y")) {
                     main(args);

                 } else {
                     System.out.println("Thank you for using the phonebook");
                     System.exit(0);
                 }

             }
             // view amount of contact
            case 3->{
                System.out.println("Amount of Contact: " + phoneBook.size());

                System.out.println("Do you want to Continue (y/n)");
                String answer = input.next();
                if (answer.equals("y")) {
                    main(args);

                } else {
                    System.out.println("Thank you for using the phonebook");
                    System.exit(0);
                }


            }
            // view all contact
            case 4->{
                System.out.println("All Contact: " + phoneBook.getPhoneBook());
                System.out.println("Do you want to Continue (y/n)");
                String answer = input.next();
                if (answer.equals("y")) {
                    main(args);

                } else {
                    System.out.println("Thank you for using the phonebook");
                    System.exit(0);
                }


            }
            // exit the program
            case 5->{
                System.out.println("Thank you for using our application");
                System.out.println("=============================================");
                System.out.println("             WE HATE YOU");
                System.out.println("=============================================");
                System.exit(0);

            }
        }

    }
}