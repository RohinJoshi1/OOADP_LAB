package Facade;
import java.util.*;
public class ProcessSales {
    boolean certificate;
    double amt;
    int qty;
    Scanner sc = new Scanner(System.in);
    ProcessSales(boolean cert,double amt,int qty){
        this.certificate = cert;
        this.qty = qty;
        this.amt = amt;
    }
    void makeSale(){
        if(!certificate){
            System.out.println("No coupons found,please pay "+amt);
        }else{
            System.out.println("Enter gift certificate value");
            double val = Double.parseDouble(sc.nextLine());

            if(qty<0){
                System.out.println("No items in cart");
            }else if(qty >1){
                System.out.println("Allowed to purchase only 1 item");
            }else if(amt > val){
                System.out.println("Redeeming gift certificate, kindly pay remaining balance of "+(amt-val)+" in CASH ONLY");
            }else{
                System.out.println("Redeeming gift certificate");
            }
        }
    }
}
