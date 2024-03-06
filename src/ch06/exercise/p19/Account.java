package ch06.exercise.p19;

public class Account {
    private static final int MAX_BALANCE = 1_100_000;
    private static final int MIN_BALANCE = 0;
    private int Balance;

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        if (balance > MIN_BALANCE && balance <= MAX_BALANCE)
            this.Balance = balance;
    }
}
