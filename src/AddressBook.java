import java.util.ArrayList;
import java.util.Collection;

public static class AddressBook {
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
    BuddyInfo buddy = new BuddyInfo("Devin", "1234 Alphabet Lane", "1112223456");
    AddressBook addressBook = new AddressBook();
    addressBook.addBuddyInfo(buddy);
    addressBook.removeBuddyInfo(buddy);
}
