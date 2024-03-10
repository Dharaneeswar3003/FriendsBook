import java.util.ArrayList;
import java.util.List;

public class Friends {
    //requires: none
    //modifies: none
    //effects: none
    private static List<Friends> friendsList = new ArrayList<>();
    private static List<Friends> displayList = new ArrayList<>();
    

    private String firstname;
    private String lastname;
    private int age;
    private String phoneNumber;

    //Constructor for friend...
    public Friends(String firstname, String lastname, int age, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        friendsList.add(this);
        displayList.add(this);
    }
    //Getters and setters...
    public String getfirstName() {
        return firstname;
    }

    public void setfirstName(String firstname) {
        this.firstname = firstname;
    }
    public String getlastName() {
        return lastname;
    }
    public void setlastName(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
}
