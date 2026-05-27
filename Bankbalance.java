class Bankbalance {
    private double balance;
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public static void main(String args[]) {
        Bankbalance b1 = new Bankbalance();
        b1.setBalance(5000.00);
        System.out.println("Bank balance is: " + b1.getBalance());
    }
}