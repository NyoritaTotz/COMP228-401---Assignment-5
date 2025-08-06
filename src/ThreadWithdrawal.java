public class ThreadWithdrawal extends Thread {
    private final Bank bank;
    private final String customerName;
    private final double amount;
    
    // Constructor
    public ThreadWithdrawal(Bank bank, String customerName, double amount) {
        this.bank = bank;
        this.customerName = customerName;
        this.amount = amount;
    }
    
    // Run method - what the thread does when it starts
    @Override
    public void run() {
        bank.withdraw(customerName, amount);
    }
}