import java.util.Calendar;
import java.util.Random;


public class CreditCard{


     //             Variable Declaration             //
     private static final Random rand = new Random();
     private String accountName = new String();
     private int expirationMonth = 0;
     private int expirationYear = 0;
     private double creditLimit = 0.0;
     private double balance = 0.0;
     private int cvv = 0;
     private static int accountNumber = 1999;



     public CreditCard(String accountName, int expirationMonth, int expirationYear, double creditLimit){
          this.accountName = accountName;
          this.creditLimit = 400;
          cvv = rand.nextInt(1000);
          accountNumber++;
          if (creditLimit > 0.0){
               this.creditLimit = creditLimit;
          }

          if (dateCheck(expirationMonth, expirationYear)){
               this.expirationMonth = expirationMonth;
               this.expirationYear = expirationYear;
          }
          else{
               this.expirationMonth = getCurrentMonth();
               this.expirationYear = getCurrentYear();
          }
     }

     public CreditCard(String accountName, int expirationMonth, int expirationYear){ 
          this(accountName,expirationMonth,expirationYear,400);
     }

     public CreditCard(String accountName){ 
          this(accountName,getCurrentMonth(),getCurrentYear()+3,400);
     }

     public String toString(){
          return accountName+"("+accountNumber+"): Current Balance = $"+balance+"/"+creditLimit+", Expires: "+expirationMonth +"/"+expirationYear;
     }

     //             Accessors             //      

     public String getName(){
          return accountName;
     }

     public double getCreditLimit(){
          return creditLimit;
     }

     public int getExpireMonth(){
          return expirationMonth;
     }

     public int getExpireYear(){
          return expirationYear;
     }

     public double getBalance(){
          return balance;
     }
     
     public boolean chargeCard(double amount, int cvv){
          if (getBalance() + amount > getCreditLimit()){
               return false;
          }
          //if (cvv != )
          return true;
     }

     public boolean payCard(double amount){
          if (getBalance() - amount < 0 || amount < 0){
               return false;
          }
          return true;
     }

     private static int retrieveCVV(CreditCard card, String name, int accountNumber){
          if (card.getName().equals(name) && card.accountNumber == (accountNumber)){
               // return thiscvv;
          }
          return -1;
     }

     private boolean dateCheck(int expirationMonth, int expirationYear){ 
          if (expirationYear > getCurrentYear()+10 || expirationYear < getCurrentYear()-10){
               return false;
          }

          if (expirationMonth > 12 || expirationMonth < 1){
               return false;
          }
          return true;
     }




     //***   Try us!  See what these methods' returned values look like!  ****
     public static int getCurrentMonth(){
          Calendar currentDate = Calendar.getInstance();
          return currentDate.get(currentDate.MONTH) + 1;

     }

     public static int getCurrentYear(){
          Calendar currentDate = Calendar.getInstance();
          return currentDate.get(currentDate.YEAR);

     }
    //************************************************************************




}
