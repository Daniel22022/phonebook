import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


//create a test class for the PhoneBook class
public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook("My PhoneBook");

    //create a test method for the PhoneBook class
    @Test
    void testThatPhoneBookCanBeSet() {
        assertEquals("[]", phoneBook.getPhoneBook());
    }
    @Test
    void testThatInformationIsAddedToPhoneBookArrayList(){
        phoneBook.add("Daniel", "Nifemi"  ,"091-551-64798" , "01/01/2020" , "25 , olarewanju badmus");
        phoneBook   .add("Uzochukwu", "Joshua"  ,"081-338-5897" , "01/01/2022" , "25 , olarewanju badmus");
        assertEquals(2, phoneBook.size());
        System.out.println(phoneBook.getPhoneBook());
    }
    @Test
    void testThatInformationIsRemovedFromPhoneBook(){
        phoneBook.add("Daniel", "Nifemi"  ,"091-551-64798" , "01/01/2020" , "25 , olarewanju badmus");
        phoneBook.add("Uzochukwu", "Joshua"  ,"081-338-5897" , "01/01/2022" , "25 Olarewanju Badmus");
        phoneBook.remove("Daniel" , "Nifemi"  , "091-551-64798" , "01/01/2020");
        assertEquals(1, phoneBook.size());
    }
    @Test
    void testThatSizeCanBeGotten(){
        phoneBook.add("Daniel", "Nifemi"  ,"091-551-64798" , "01/01/2020" , "25 Olarewanju Badmus");
        phoneBook.add("Uzochukwu", "Joshua"  ,"081-338-5897" , "01/01/2022" , "25 Olarewanju Badmus");
        assertEquals(2, phoneBook.size());
        System.out.println(phoneBook.size());
    }
    @Test
    void testThatSurnameOfContactCanBeViewed(){
        phoneBook.add("Daniel", "Nifemi"  ,"091-551-64798" , "01/01/2020" , "25 Olarewanju Badmus");
        phoneBook.add("Uzochukwu", "Joshua"  ,"081-338-5897" , "01/01/2022" , "25 Olarewanju Badmus");
        phoneBook.view("Daniel");
        assertEquals("Daniel" , phoneBook.getView());

    }
}
