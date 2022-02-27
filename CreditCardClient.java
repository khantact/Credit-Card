public class CreditCardClient {
    public static void main(String[] args){

        //                 Constructor testing                 //

            //          Test constructor redirection          //
                //CreditCard c1 = new CreditCard("Kevin Han");
                //CreditCard c1 = new CreditCard("Kevin Han", 4, 2024);
                //CreditCard c1 = new CreditCard("Kevin Jam", 6, 2025, 450);
            
            //          Test creditLimit          //
                //CreditCard c1 = new CreditCard("Kevin Han",4,2024,-300);
                //CreditCard c1 = new CreditCard("Kevin Han",14,2024,400);
                // CreditCard c1 = new CreditCard("Kevin Han",14,2024,0);

            //          Test expirationYear/Month          //
                // CreditCard c1 = new CreditCard("Kevin Han", 4, 2100);
                // CreditCard c1 = new CreditCard("Kevin Han", 0, 2025);
                // CreditCard c1 = new CreditCard("Kevin Han", 4, 1345);

            //          Test counter increment      //
                // CreditCard c1 = new CreditCard("Kevin Han", 4, 2024, 150);
                // CreditCard c2 = new CreditCard("Kevin Jam", 7, 2025, 450);
            //System.out.println(c1);
            //System.out.println(c2);
        //                         End of Testing                         //
 
        CreditCard khan = new CreditCard("Kevin Han", 4, 2024, 500);
        CreditCard khan1 = new CreditCard("Jane Doe", 4, 2024, 500);
        System.out.println(khan);
        System.out.println(khan1);





    }
}
