import java.util.ArrayList;

public class AddressBook {

    public static void main(String[] args) {
        System.out.println("Address Book");
        System.out.println("Address Book");
        System.out.println("Address Book");
        AddressBook book = new AddressBook();
        BuddyInfo buddy = new BuddyInfo("Jack","Carelton",1234567);
        book.addBuddy(buddy);
        book.removeBuddy(buddy);

    }


    private ArrayList<BuddyInfo> list;

    public AddressBook() {
        list = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        list.add(buddy);

    }

    public void removeBuddy(BuddyInfo buddy){
        list.remove(buddy);
    }
}
