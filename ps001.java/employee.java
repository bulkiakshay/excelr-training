package ps001;
public class employee {

    // Instance variables
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    // Default constructor
    public Employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    // Parameterized constructorj
    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Method to get full name
    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    // Getters and setters (optional, for accessing and modifying private variables)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        // Using the default constructor
        Employee employee1 = new Employee();
        System.out.println("Employee 1 Full Name: " + employee1.fullName());

        // Using the parameterized constructor
        Employee employee2 = new Employee(101, "John", "Doe", "123 Elm Street");
        System.out.println("Employee 2 Full Name: " + employee2.fullName());
    }
}
