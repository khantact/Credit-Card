public class CreditCardClient {
    public static void main(String[] args) {
        // CreditCard khan = new CreditCard("Kevin Han", 6, 2020, 500);
        // CreditCard khan1 = new CreditCard("Kevin Han", 4, 2024, 700);
        // System.out.println(khan);
        // System.out.println(khan1);
        // Test constructor redirection //
        /*
         * CreditCard c1 = new CreditCard("Kevin Han");
         * CreditCard c1 = new CreditCard("Kevin Han", 4, 2024);
         * CreditCard c1 = new CreditCard("Kevin Jam", 6, 2025, 450);
         */
        // Test creditLimit //
        /*
         * CreditCard c1 = new CreditCard("Kevin Han",4,2024,-300);
         * CreditCard c1 = new CreditCard("Kevin Han",14,2024,400);
         * CreditCard c1 = new CreditCard("Kevin Han",14,2024,0);
         */
        // Test expirationYear/Month //
        /*
         * CreditCard c1 = new CreditCard("Kevin Han", 4, 2100);
         * CreditCard c1 = new CreditCard("Kevin Han", 0, 2025);
         * CreditCard c1 = new CreditCard("Kevin Han", 4, 1345);
         */

        // Test counter increment //
        /*
         * CreditCard c1 = new CreditCard("Kevin Han", 4, 2024, 150);
         * CreditCard c2 = new CreditCard("Kevin Jam", 7, 2025, 450);
         * System.out.println(c1);
         * System.out.println(c2);
         */

        // Test extendOnlyExpired //
        /*
         * CreditCard[] cards = { khan, khan1 };
         * CreditCard.extendOnlyExpired(cards, 2);
         * CreditCard.extendOnlyExpired(cards, 14);
         * CreditCard.extendOnlyExpired(cards, -1);
         */
        // Test extendExpireDate //
        /*
         * khan.extendExpireDate(14);
         * khan.extendExpireDate(-1);
         */

        // Test chargeCard & payCard //
        /*
         * khan.setCvv(124);
         * khan.chargeCard(125.34, 124);
         * khan.chargeCard(-24, 124);
         * khan.chargeCard(125.34, 100);
         * khan.payCard(245);
         * khan.payCard(124.50);
         * khan.payCard(-40);
         * khan.payCard(400);
         * khan.payCard(245);
         * khan.payCard(0);
         * khan.chargeCard(250, 124);
         */
        // Test retrieveCvv //
        /*
         * khan.setCvv(124);
         * System.out.println(CreditCard.retrieveCvv(khan, "Kevin Han", 2000));
         * System.out.println(CreditCard.retrieveCvv(khan, "bob", 2000));
         * System.out.println(CreditCard.retrieveCvv(khan, "Kevin Han", 2401));
         */
        // Test mergeCards //
        /*
         * CreditCard khan = new CreditCard("Kevin Han", 6, 2020, 500);
         * CreditCard khan = new CreditCard("Kevin Han", 6, 2020, 200);
         * CreditCard khan1 = new CreditCard("Jane Doe", 4, 2024, 500);
         * khan1.chargeCard(130, 125);
         * 
         * khan.setCvv(124);
         * khan1.setCvv(125);
         * khan.chargeCard(120, 124);
         * khan1.payCard(400);
         * 
         * System.out.println(CreditCard.mergeCards(khan, khan1));
         * System.out.println(khan);
         * System.out.println(khan1);
         */

    }
}
