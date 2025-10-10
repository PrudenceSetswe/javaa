public abstract class Customer {
    private String customerID;
    private String address;

    public Customer(String customerID, String address) {
        this.customerID = customerID;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addAccount(Account account) {
        System.out.println("Account " + account.getAccountNumber() + " added for customer " + customerID);
    }

    public void getAccount() {
        System.out.println("Fetching account details for " + customerID);
    }
}
