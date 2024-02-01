public class Main {
    public static void main(String[] args) {
        String accountNumber = "0001";
        String accountHolder = "Chanraksmey";
        double balance = 0;
        double interestRate = 5;

        // //Create new Account object
        System.out.println("----------Account----------------");
        Account newAccount = new Account(accountNumber, accountHolder, balance);
        System.out.println(newAccount.toString());
        System.out.println(newAccount.getAccountNumber());
        System.out.println(newAccount.getAccountHolder());
        System.out.println(newAccount.balance);
        

        newAccount.deposit(10);
        System.out.println(newAccount.balance);
        newAccount.withdraw(11);
        System.out.println(newAccount.balance);

        //Create new Saving Account object
        System.out.println("\n----------SavingsAccount----------------");
        SavingsAccount save = new SavingsAccount(accountNumber, accountHolder, balance, interestRate);
        System.out.println(save.toString());
        System.out.println(save.getAccountNumber());
        System.out.println(save.getAccountHolder());
        System.out.println(save.balance);
        

        save.deposit(10);
        System.out.println(save.balance);
        save.withdraw(11);
        System.out.println(save.balance);
        save.calculateInterest();
        System.out.println(save.balance);



    }
}
