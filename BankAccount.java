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

  /*This private method will allow internal methods to check the password easily*/
  private boolean authenticate(String password){
    return (this.password==password);
  }

  /**Transfer money from this BankAccount to the other.
   *@param other which BankAccount to GIVE the money to
   *@param amount how much money to transfer, negative amounts will make this operation fail.
   *@param the password of the source account, incorrect password will make this operation fail.
   *@return true if successful, false otherwise.
   */
  public boolean transferTo(BankAccount other, double amount, String password) {
    if (authenticate(password)==true)
    {
      return other.deposit(amount);
    }
    else
    {
      return false;
    }
  }
}
