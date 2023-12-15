class JointAccount {
    private double balance;

    public JointAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
        System.out.println("Current balance after deposit: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
            System.out.println("Current balance after withdrawal: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw. Insufficient balance.");
        }
    }
}

class JointAccountHolder extends Thread {
    private JointAccount account;
    private boolean isDeposit;
    private double amount;

    public JointAccountHolder(JointAccount account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class JointAccount_threading{
    public static void main(String[] args) {
        JointAccount account = new JointAccount(1000.0);

        JointAccountHolder holder1 = new JointAccountHolder(account, true, 200.0); // Deposit
        JointAccountHolder holder2 = new JointAccountHolder(account, false, 300.0); // Withdraw

        holder1.start();
        holder2.start();
    }
}

