import java.util.ArrayList;
import java.util.Collection;

public static class AddressBook {
    private Collection<BuddyInfo> addresses;

    public AddressBook() {
        addresses = new ArrayList<BuddyInfo>();
    }

    public void addBuddyInfo(BuddyInfo buddy) {
        if(buddy != null) {
            addresses.add(buddy);
        }
    }

    public void removeBuddyInfo(BuddyInfo buddy) {
        addresses.remove(buddy);
    }

    public void printHello() {
        System.out.println("Hello");
    }
    public void printSomething(){
        System.out.println("Something");
    }
}

public static void main(String[] args) {
    BuddyInfo buddy = new BuddyInfo("Devin", "1234 Alphabet Lane", "1112223456");
    AddressBook addressBook = new AddressBook();
    addressBook.addBuddyInfo(buddy);
    addressBook.removeBuddyInfo(buddy);
    addressBook.addBuddyInfo(buddy);
    System.out.println("Added this line");
    System.out.println("Added this line in GitHub");
}
