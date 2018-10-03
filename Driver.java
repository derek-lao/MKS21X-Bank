public class Driver{

  public static void main(String[]args){
    BankAccount var=new BankAccount(999.0, 12345, "quadraticequation");
    var.setPassword("mrjumash");


  if( var.withdraw(1000.0) ){
          System.out.println("Withdrawal success!");
     }else{
          System.out.println("Withdrawal failure");
     }
   }
}
