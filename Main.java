public class Main {
    public static void main(String[] args) {
        // Create a customer
        PersonCustomer customer = new PersonCustomer("C001", "Gaborone", "John", "Doe");

        // Create a savings account
        SavingsAccount savings = new SavingsAccount("A1001", "Main Branch");

        // Test deposit and withdraw
        savings.deposit(1000);
        System.out.println("Balance after deposit: " + savings.getBalance());

        savings.withdraw(200);
        System.out.println("Balance after withdraw: " + savings.getBalance());

        // Test interest calculation
        double interest = savings.calculateInterest();
        System.out.println("Interest earned: " + interest);

        // Test transaction
        Transaction t = new Transaction("T001", "Deposit", 1000);
        t.record();

        // Link account to customer
        customer.addAccount(savings);
    }
}
