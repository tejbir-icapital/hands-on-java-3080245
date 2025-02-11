package bank;

import javax.sql.DataSource;

import bank.exceptions.AmountException;

public class Account {

private int accountId;
private String accountType;
private double balance;

public Account(int accountId, String accountType, double balance) {
  setAccountId(accountId);
  setAccountType(accountType);
  setBalance(balance);
}

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  public String getAccountType() {
    return this.accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) throws AmountException {
    if (amount < 1) {
      throw new AmountException("The minimum deposit is 1.00.");
    }
    else {
      double newBalance = balance + amount;
      setBalance(newBalance);
      Datasource.updateAccountBalance(accountId, newBalance);
    }
  }

  public void withdraw(double amount) throws AmountException {
    if (amount < 0) {
      throw new AmountException("The withdrawal amount must be greater than 0.");
    }
    else if (amount > getBalance()) {
      throw new AmountException("You do not have sufficient funds for this withdrawal.")
    }
    else {
      double newBalance = balance = amount;
      setBalance(newBalance);
      Datasource.updateAccountBalance(accountId, newBalance);
    }
  }
}
