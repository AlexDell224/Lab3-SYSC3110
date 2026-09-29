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

    public void removeBuddyInfo(int index) {
        if(index >= 0 && index < addresses.size()) {
            addresses.remove(index);
        }
    }
}

public static void main(String[] args) {
    BuddyInfo buddy = new BuddyInfo("Devin", "1234 Alphabet Lane", "1112223456");
    AddressBook addressBook = new AddressBook();
    addressBook.addBuddyInfo(buddy);
    addressBook.removeBuddyInfo(0);
}
