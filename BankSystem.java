// BankSystem.java (Ques 2)

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String number, double money) {
        accountNumber = number;
        balance = money;
    }

    void deposit(double money) {
        if (money > 0) {
            balance = balance + money;
            System.out.println("Added money: " + money);
        } else {
            System.out.println("Need more than 0 money");
        }
    }

    void withdraw(double money) {
        if (money > 0 && money <= balance) {
            balance = balance - money;
            System.out.println("Took out: " + money);
        } else {
            System.out.println("Not enough money");
        }
    }

    double getBalance() {
        return balance;
    }
}

// Subclass  of the  class bank account
class SavingsAccount extends BankAccount {
    double interest;

    SavingsAccount(String number, double money, double rate) {
        super(number, money);
        interest = rate;
    }
    @override
    void withdraw(double money) {
        if (money < 1000) {
            System.out.println("Need at least 1000 to take out");
        } else {
            super.withdraw(money);
        }
    }

    void addInterest() {
        double extra = balance * interest / 100;
        balance = balance + extra;
        System.out.println("New balance with interest: " + balance);
    }
}

// Demo class
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("SA123", 1500, 5);

        System.out.println("Starting balance: " + account.getBalance());
        account.deposit(500);
        System.out.println("Balance now: " + account.getBalance());
        account.addInterest();
        System.out.println("Balance with interest: " + account.getBalance());
        account.withdraw(900);
        System.out.println("Final balance: " + account.getBalance());
    }
}