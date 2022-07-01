package testsClass;

public class Account {

    private int balance;
    private int deposit;
    private int amount;

    public void deposit(int amount) {
        if (amount <= 0) {
            this.balance = balance;
        }
        if (amount > 0) {
            this.balance = balance + amount;
        }
    }

    public int getBalance() {
        return balance;

    }

    public void withdraw(int withdrawalAmount) {
        balance = balance - withdrawalAmount;

    }
}

