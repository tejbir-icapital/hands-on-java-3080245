package bank;

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

  public void deposit(double amount) {

  }

  public void withdraw(double amount) {

  }
}
