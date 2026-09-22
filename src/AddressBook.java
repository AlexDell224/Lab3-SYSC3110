import java.util.ArrayList;
import java.util.Collection;

public class AddressBook {
    private Collection<BuddyInfo> addresses;

    public AddressBook() {
        addresses = new ArrayList<BuddyInfo>();
    }

    public void addBuddyInfo(BuddyInfo buddy) {
        addresses.add(buddy);
    }

    public void removeBuddyInfo(BuddyInfo buddy) {
        addresses.remove(buddy);
    }
}

public static void main(String[] args) {
    System.out.println("Address Book");
}
