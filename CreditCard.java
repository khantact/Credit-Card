import java.util.Calendar;
import java.util.Random;

public class CreditCard {

     // Variable Declaration //

     private static final Random rand = new Random();
     private String accountName = new String();
     private int expirationMonth = 0;
     private int expirationYear = 0;
     private double creditLimit = 0.0;
     private double balance = 0.0;
     private int cvv = 0;
     private static int count = 2000;
     private int accountNumber = 0;

     // Constructors //

     public CreditCard(String accountName, int expirationMonth, int expirationYear, double creditLimit) {
          this.accountName = accountName;
          this.creditLimit = 400;
          cvv = rand.nextInt(900) + 100;
          this.accountNumber = count++;
          if (creditLimit > 0.0) {
               this.creditLimit = creditLimit;
          }

          if (dateCheck(expirationMonth, expirationYear)) {
               this.expirationMonth = expirationMonth;
               this.expirationYear = expirationYear;
          } else {
               this.expirationMonth = getCurrentMonth();
               this.expirationYear = getCurrentYear();
          }
     }

     public CreditCard(String accountName, int expirationMonth, int expirationYear) {
          this(accountName, expirationMonth, expirationYear, 400);
     }

     public CreditCard(String accountName) {
          this(accountName, getCurrentMonth(), getCurrentYear() + 3, 400);
     }

     public String toString() {
          return accountName + "(" + accountNumber + "): Current Balance = $" + balance + "/" + creditLimit
                    + ", Expires: " + expirationMonth + "/" + expirationYear;
     }

     // Accessors //

     public String getName() {
          return accountName;
     }

     public double getCreditLimit() {
          return creditLimit;
     }

     public int getExpireMonth() {
          return expirationMonth;
     }

     public int getExpireYear() {
          return expirationYear;
     }

     public double getBalance() {
          return balance;
     }

     // Hard Coding Tests - for testing only //

     public void setCvv(int cvv) {
          this.cvv = cvv;
     }

     public void getCvv() {
          System.out.println(this.cvv);
     }

     // Object Methods //

     public boolean chargeCard(double amount, int cvv) {
          if (getBalance() + amount > getCreditLimit() || cvv != this.cvv || amount < 0) {
               return false;
          }

          balance += amount;
          return true;
     }

     public boolean payCard(double amount) {
          if (amount < 0 || getBalance() < 0) {
               return false;
          }
          balance -= amount;
          return true;
     }

     public void extendExpireDate(int months) {
          int years = months / 12;
          int remaining_months = months % 12;
          if (months < 0) {
               return;
          }
          expirationMonth += remaining_months;
          expirationYear += years;

     }

     public static void extendOnlyExpired(CreditCard[] cards, int months) {
          if (months < 0) {
               return;
          }
          for (int i = 0; i < cards.length; i++) { // iterates through credit card array
               if (cards[i].dateCheck(cards[i].getExpireMonth(), cards[i].getExpireYear())) {
                    if (cards[i].getExpireYear() < getCurrentYear()) {
                         cards[i].extendExpireDate(months);
                    } else if (cards[i].getExpireYear() == getCurrentYear()) {
                         if (cards[i].getExpireMonth() < getCurrentMonth()) {
                              cards[i].extendExpireDate(months);
                         }
                    }
               }
          }
     }

     public static int retrieveCvv(CreditCard card, String name, int accountNum) {
          if (card.getName().equals(name) && card.accountNumber == (accountNum)) {
               return card.cvv;
          }
          return -1;
     }

     public static CreditCard mergeCards(CreditCard c1, CreditCard c2) {
          double newCreditLimit = c1.getCreditLimit() + c2.getCreditLimit();
          double newBalance = c1.getBalance() + c2.getBalance();
          String newName = c1.getName() + " and " + c2.getName();
          int newExpirationMonth = 0;
          int newExpirationYear = 0;

          if (c1.getExpireMonth() > c2.getExpireMonth()) {
               newExpirationMonth = c1.getExpireMonth();
          } else {
               newExpirationMonth = c2.getExpireMonth();
          }

          if (c1.getExpireYear() > c2.getExpireYear()) {
               newExpirationYear = c1.getExpireYear();
          } else {
               newExpirationYear = c2.getExpireYear();
          }
          destroyCards(c1, c2);
          CreditCard newCard = new CreditCard(newName, newExpirationMonth, newExpirationYear, newCreditLimit);
          newCard.balance = newBalance;
          return newCard;
     }

     // Helper Functions //

     private static void destroyCards(CreditCard c1, CreditCard c2) {
          c1.balance = -1;
          c1.cvv = -1;
          c1.expirationMonth = -1;
          c1.expirationYear = -1;
          c1.creditLimit = -1;
          c1.accountName = "Merged with #" + c2.accountNumber;

          c2.balance = -1;
          c2.cvv = -1;
          c2.expirationMonth = -1;
          c2.expirationYear = -1;
          c2.creditLimit = -1;
          c2.accountName = "Merged with #" + c1.accountNumber;

     }

     private boolean dateCheck(int expirationMonth, int expirationYear) {
          if (expirationYear > getCurrentYear() + 10 || expirationYear < getCurrentYear() - 10) {
               return false;
          }

          if (expirationMonth > 12 || expirationMonth < 1) {
               return false;
          }
          return true;
     }

     public static int getCurrentMonth() {
          Calendar currentDate = Calendar.getInstance();
          return currentDate.get(currentDate.MONTH) + 1;

     }

     public static int getCurrentYear() {
          Calendar currentDate = Calendar.getInstance();
          return currentDate.get(currentDate.YEAR);

     }
     // ************************************************************************

}
