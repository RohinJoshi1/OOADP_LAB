package Facade;
/*
 * Façade (Structural): You get a call from Ms.Betty Cooper of Bangalore Decathlon office that 
 * there is a policy decision 
 * made globally to incorporate some new rules for ‘Process Sale UseCase’. 
 * For e.g. if payment is made via gift-certificate, 
 * the customer can buy only one item for the amount in the certificate. 
 * No other items can be bought with that gift-certificate. 
 * There must be no cash-back to the customer if the item costs less than amount specified in the giftcertificate. 
 * If the item costs more, the excess payment can be accepted via cash only & not credit / debit cards. 
 * When a new sale is created, these rules must become effective. 
 * You come to know from Mr. Satya Nadella, an expert in finding 3rd-party partners, 
 * that the Italian Competitor for Decathlon called ‘Sport 2000’ has a ready-made ‘rule-engine’ sub-system for this, 
 * whose specific implementation details is not known yet, as the business heads of Decathlon & Sport 2000 are chalking 
 * out the software purchase terms. This Sport 2000 rule-engine will be responsible for evaluating a set of rules against 
 * an operation & indicating if any of the rules invalidated the operation (e.g. ‘makeNewSale’ operation).                
 * How will you use the Façade pattern to provide a common unified                
 * interface to a dissimilar set of implementations, developed by a 3rd-party                
 * vendor, the implementation details are not known to you? 
 */

 /*
  * NOTES
  1.Create a class for sale of items following the rule-engine
  2.Create a class for adding items to cart
  3.
  */
public class Main {
    public static void main(String[] args) {
        Facade f = new Facade(true);
        f.displayItems();
        f.processSale();
    }
}
