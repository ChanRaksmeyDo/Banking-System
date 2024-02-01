class SavingsAccount extends Account {
    //Attributes
    private double interestRate;

    //Constructor
    public SavingsAccount (String accountNumber, String accountHolder, double balance, double interestRate){
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    //Overide Withdraw
    @Override
    public void withdraw( double withdrawMoney){
        if ( withdrawMoney > 0 && withdrawMoney < this.balance){
            this.balance -= withdrawMoney;
            System.out.println("Successfully withdraw: $" + withdrawMoney);
        } else {
            System.out.println("Money withdraw must exced 0 and must lower than balance");
            this.balance -= 1.2;
            System.out.println(" Remained Balance: $" + this.balance);
        }
    }

    //Caculate Interestrate
    public void calculateInterest(){
        this.balance += ( this.balance*this.interestRate)/100;
    }
}
