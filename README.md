# Banking-System
## Introduction
The Banking System is a Java-based application designed to manage bank accounts, allowing users to create and interact with both normal and savings accounts. It provides features such as depositing funds, withdrawing funds with penalties for savings accounts, and calculating interest rates for savings accounts.
## Object Oriented Features
### Classes
- **Account**: Represents a basic bank account with attributes accountNumber, accountHolder, and balance, along with methods for deposit() and withdrawal().
- **SavingsAccount**: Subclass of Account, it as an additional attribute of interestRate and overriding the withdraw() method to include penalties for exceeding the account balance.
### Inheritance
The **SavingsAccount** class inherits from **Account** class which they share a common interface for withdraw() and deposit() operation.
### Polymorphism
In this system, we demonstate polymorphism through usage of inheritance and method overriding
- **Method Overriding:** We override the **withdraw** method in the **SavingsAccount** class to implement specific behavior for savings accounts, such as applying penalties for over withdrawal accounts.
  ```
  @Override
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0 && withdrawAmount <= this.balance) {
            this.balance -= withdrawAmount;
            System.out.println("Withdrew $" + withdrawAmount + ". New balance: $" + this.balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
            this.balance -= 0.5;// Apply penalty
            System.out.println("Penalty charged. New balance: $" + this.balance);
        }
    }
  ```
### Encapsulation
- We use **private** attribute for **accountNumber** and **accountHolder** in **Account** class AND **interestRate** in **SavingsAccount** class because we don't want any other class to directly access it and modify it.
- We also use **protected** attribute for **balance** in **Account** class because we are planning to use it in subclass in **SavingsAccount** to calculate **calculateInterest()** method.
- We use **public** **toString** method in **'Account'** class, so that the private attribute inside such as **accountNumber** and **accountHolder** can be access by other class.
```
public String toString() {
        return "Account Number: " + this.accountNumber + "\nAccount Holder: " + this.accountHolder + "\nBalance: $" + this.balance;
    }
```
