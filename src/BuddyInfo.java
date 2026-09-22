public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public BuddyInfo() {
        this.name = "Devin";
        this.address = "1234 Alphabet Street";
        this.phoneNumber = "123-456-7890";
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    static void main() {
        BuddyInfo buddy = new BuddyInfo("Abc", "123", "4");
        System.out.println("Hello " + buddy.getName());
    }
}
