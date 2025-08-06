public class Main {
    public static void main(String[] args) {
        // Create a bank object with $500 initial balance
        Bank bank = new Bank();
        
        System.out.println("Initial Balance: $" + bank.getBalance());
        System.out.println("Starting transactions...\n");
        
        // Create withdrawal threads - 4 customers withdrawing $100 each
        ThreadWithdrawal w1 = new ThreadWithdrawal(bank, "Customer1", 100.0);
        ThreadWithdrawal w2 = new ThreadWithdrawal(bank, "Customer2", 100.0);
        ThreadWithdrawal w3 = new ThreadWithdrawal(bank, "Customer3", 100.0);
        ThreadWithdrawal w4 = new ThreadWithdrawal(bank, "Customer4", 100.0);
        
        // Create deposit threads - 4 customers depositing $50 each
        ThreadDeposit d1 = new ThreadDeposit(bank, "Depositor1", 50.0);
        ThreadDeposit d2 = new ThreadDeposit(bank, "Depositor2", 50.0);
        ThreadDeposit d3 = new ThreadDeposit(bank, "Depositor3", 50.0);
        ThreadDeposit d4 = new ThreadDeposit(bank, "Depositor4", 50.0);
        
        try {
            // Start all withdrawal threads
            w1.start(); w2.start(); w3.start(); w4.start();
            
            // Start all deposit threads
            d1.start(); d2.start(); d3.start(); d4.start();
            
            // Wait for all threads to complete
            w1.join(); w2.join(); w3.join(); w4.join();
            d1.join(); d2.join(); d3.join(); d4.join();
            
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        
        System.out.println("\nFinal Balance: $" + bank.getBalance());
        System.out.println("Expected: $300 (500 - 400 + 200)");
    }
}
