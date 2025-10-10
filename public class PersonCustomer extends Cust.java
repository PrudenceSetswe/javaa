public class PersonCustomer extends Customer {
    private String firstName;
    private String lastName;

    public PersonCustomer(String customerID, String address, String firstName, String lastName) {
        super(customerID, address);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
