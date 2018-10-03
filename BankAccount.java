public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double newbalance, int newaccountID, String newpassword){
    balance=newbalance;
    accountID=newaccountID;
    password=newpassword;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String decidepassword){
    password=decidepassword;
  }

  public String toString(){
    return (accountID + "") + ("\t") + (balance + "");
  }

  public boolean deposit(double depositamount){
    if (depositamount<0)
    {
      return false;
    }
    else
    {
      balance += depositamount;
      return true;
    }
  }

  public boolean withdraw(double withdrawamount){
    if (balance<withdrawamount || withdrawamount<0)
    {
      return false;
    }
    else
    {
      balance -= withdrawamount;
      return true;
    }
  }


}
