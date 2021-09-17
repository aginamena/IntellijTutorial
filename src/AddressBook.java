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
    }
}
