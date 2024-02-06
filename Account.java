class Account {
    //Attributes
    private String accountNumber;
    private String accountHolder;
    protected double balance;

    //Constructor
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    //Deposit method
    public void deposit(double depositMoney) {
        if (depositMoney > 0) {
            this.balance += depositMoney;
            System.out.println("Successfully deposit: $" + depositMoney);
        } else {
            System.out.println("Money deposit must exceed 0");
        }
    }

    //Withdraw method
    public void withdraw( double withdrawMoney){
        if ( withdrawMoney > 0 && withdrawMoney < this.balance){
            this.balance -= withdrawMoney;
            System.out.println("Successfully withdraw: $" + withdrawMoney);
        } else {
            System.out.println("Money withdraw must exced 0 and must lower than balance");
        }
    }


    //Encapsulation toString method
    public String toString(){
        return ("Account Number: " + accountNumber + "\nAccount Holder: " + accountHolder + "\nBalance: " + balance);
    }
}
