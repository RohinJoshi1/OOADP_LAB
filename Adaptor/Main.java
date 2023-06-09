package Adaptor;

/**
 * Main
 * Adaptor (Structural): To establish the 1st Decathlon store in Mauritius, 
 * you go along with Mr. Satya Nadella, an expert in finding 3rd-party partners. 
 * For e.g. a 3rd-party Tax-Calculator system to cater to the specifics of Sales and 
 * VAT (Value-added services Tax) tax 
 * calculations in different countries. 
 * He finds a 3rd-party Tax-Calculator system called ‘MauriTax’ in Port 
 * Louis. The problem is, the APIs used by ‘MauriTax’ for tax-calculation is fixed & cannot be changed.
 * The ‘MauriTax’ APIs are incompatible with ‘Decathlon POS’. 
 * How will you use the Adaptor Pattern to design & implement? 
 */

 public class Main {
public static void main(String[] args) {
    DecathlonTax dtx = new DecathlonTax();
    Item i1 = new Item("item", 10, 100.5, dtx);
    i1.printPrice();
    i1.setTax(new myMauritius());
    i1.printPrice();

}
    
}