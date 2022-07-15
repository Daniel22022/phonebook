import java.util.Random;
import java.util.Scanner;

// create an application that can be used to test the PhoneBook class
//the application should have a menu that allows the user to add, remove, and get the phone book
//the application should have a menu that allows the user to add, remove, and get the diary
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook("PhoneBook");

        String Menu = """
                1. Insert Information
                2. Remove Inserted Information
                3. Check Amount Of Saved Information
                4. View Saved Information
                5. Exit
                """;
        System.out.println(Menu);

        int userResponse = input.nextInt();
        switch (userResponse) {
            case 1 -> {

                System.out.println("Enter full name: ");
                String response = input.nextLine();

                input.nextLine();

                System.out.println("Enter Date Added: ");
                response = input.nextLine();


                input.nextLine();

                System.out.println("Enter The Number: ");
                response = input.nextLine();
                System.out.println("LOADING .....");
                System.out.println("LOADING >>>>>>");
                System.out.println();
                System.out.println("Information Has Been Saved !!! .......");

                input = new Scanner(System.in);


            }
             case 2-> {
                 System.out.println("Enter Full Name Of Information To Be Deleted: ");
                 String response = input.nextLine();

                 input.nextLine();

                 System.out.println("Enter Date Added  Of Information To Be Deleted: ");
                 response = input.nextLine();


                 input.nextLine();

                 System.out.println("Enter The Number  Of Information To Be Deleted: ");
                 response = input.nextLine();
                 System.out.println("LOADING .....");
                 System.out.println("LOADING >>>>>>");
                 System.out.println();
                 System.out.println("Information Has Been Deleted !!! .......");

             }
        }
    }
}