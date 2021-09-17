import java.util.*;
public class AddressBook {
    private ArrayList<BuddyInfo> persons;
    public AddressBook(){
        persons = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo newPerson){
        persons.add(newPerson);
    }
    public void removeBuddy(BuddyInfo removeBuddy){
        for(BuddyInfo person : persons){
            if(person.getName().equals(removeBuddy.getName())
            && person.getAddress().equals(removeBuddy.getAddress())
            && person.getPhoneNumber().equals(removeBuddy.getPhoneNumber())){
                persons.remove(person);
                break;
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Address book");
        BuddyInfo buddy  = new BuddyInfo("Tom", "Carleton", "613");
        BuddyInfo buddy2  = new BuddyInfo("Tom2", "Carleton", "613");
        BuddyInfo buddy3 = new BuddyInfo("Tom3", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.addBuddy(buddy2);
        addressBook.addBuddy(buddy3);
        addressBook.removeBuddy(buddy3);

    }
}
