import java.util.ArrayList;

public class PhoneBook {

    public ArrayList<String> phoneBook = new ArrayList<>();
    private String lastName;
    private String getView;

    public PhoneBook(String phoneBookName) {
    }

    public int size() {
        int size = phoneBook.size();
        return size;
    }

    public void add(String lastName, String firstName, String phoneNumber, String DateAdded , String Address ) {
        phoneBook.add(lastName + " " + firstName + " " + phoneNumber + " " + DateAdded);
    }

    public void remove(String lastName, String firstName , String phoneNumber, String DateAdded) {
        phoneBook.remove(lastName + " " + firstName + " " + phoneNumber + " " + DateAdded);
    }

    public String getPhoneBook() {
        return phoneBook.toString();
    }

    public String view( String lastName) {
        return lastName;
    }

    public String getView() {
        return getView();
    }
}

