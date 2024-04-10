class Account {
    int id; // Instance variable for ID
    String name; // Instance variable for name
    int dob; // Instance variable for date of birth

    // Constructor to initialize the instance variables
    public Account() {
        id = 300;
        name = "Anushka Singh";
        dob = 723;
    }

    // Method to display account information
    public void show() {
        System.out.println("Name: " + name + "\nID: " + id + "\nDOB: " + dob);
    }
}

public class B {
    public static void main(String[] args) {
        Account a = new Account();
        a.show();
    }
}
