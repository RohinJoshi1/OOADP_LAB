package Template;

import java.util.Scanner;

public class Online extends OrderProcess {
    int total = 0;
    Online(){
        super();
    }
    //online – gives tabular depiction of price comparison of the item chosen.
    @Override
    void selectItem() {
        System.out.println("####ITEMS CHOSEN####");
        System.out.println("1   |   Rs. 200");
        System.out.println("2   |   Rs. 300");
        System.out.println("3   |   Rs. 400");
        System.out.println("4   |   Rs. 500");
        total += 200+400+300+500;
    }


    @Override
    void doPayment() {
       System.out.println("Please pay via Netbanking");
    }

    @Override
    void doDelivery() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter delivery address");
        String address = sc.nextLine();
        System.out.println("Delivering package to "+address);
        System.out.println("#############");
        System.out.println("Amount payable after delivery charge: "+(total+150));
    }
    
}
