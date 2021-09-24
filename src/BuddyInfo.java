public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    /**
     *
     */
    public BuddyInfo() {
        this("no name", "no address", "no phone number");
    }

    /**
     * @param name
     * @param address
     * @param phoneNumber
     */

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return
     */

    public String getName() {
        return name;
    }

    /**
     * @param args
     */

    public String getAddress() {
        return address;
    }

    /**
     * @param args
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("homer", "1232 johnsons", "123543234");
        System.out.println(buddy.getName());
    }
}
