class Bankacc {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.work();
        bank.displayInfo();
        bank.setBalance(10000.00);
        System.out.println("Bank balance is: " + bank.getBalance());   
        Manager manager = new Manager();
        manager.manage();

        Deposite deposite = new Deposite();
        deposite.deposite();

        Withdraw withdraw = new Withdraw();
        withdraw.withdraw();

        Balance balance = new Balance();
        balance.balance();
    }
}

class Bank {
    private double balance;

    void work() {
        System.out.println("Bank is working");
    }

    void displayInfo() {
        System.out.println("Bank account details are displayed");
    }

    void setBalance(double amount) {
        this.balance = amount;
    }

    double getBalance() {
        return balance;
    }
}

class Manager extends Bank {
    void manage() {
        System.out.println("Manager is managing the bank");
    }
}

class Deposite {
    void deposite() {
        System.out.println("Amount has been deposited");
    }
}

class Withdraw {
    void withdraw() {
        System.out.println("Amount has been withdrawn");
    }
}

class Balance {
    void balance() {
        System.out.println("Current balance checked");
    }
}