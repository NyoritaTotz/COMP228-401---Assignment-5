public class Bank {
    private double balance;
    
    // Constructor
    public Bank() {
        this.balance = 500.00; // Starting with $500 as per requirement
    }
    
    // Synchronized method for withdrawal
    public synchronized void withdraw(String name, double amount) {
        System.out.println(name + " wants to withdraw $" + amount);
        if (balance >= amount) {
            System.out.println(name + " is withdrawing $" + amount);
            balance = balance - amount;
            System.out.println(name + " withdrew $" + amount + ". Balance: $" + balance);
        } else {
            System.out.println(name + " cannot withdraw $" + amount + ". Not enough money!");
        }
    }
    
    // Synchronized method for deposit
    public synchronized void deposit(String name, double amount) {
        System.out.println(name + " is depositing $" + amount);
        balance = balance + amount;
        System.out.println(name + " deposited $" + amount + ". Balance: $" + balance);
    }
    
    // Get balance
    public double getBalance() {
        return balance;
    }
}