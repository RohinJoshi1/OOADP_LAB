package Template;

import java.util.Scanner;

public class Offline extends OrderProcess {
    int total = 0;
    @Override
    void selectItem() {
        System.out.println("AVAILABLE ITEMS");
        System.out.println("1   |   Rs. 200");
        System.out.println("2   |   Rs. 300");
        System.out.println("3   |   Rs. 400");
        System.out.println("4   |   Rs. 500");
        System.out.println("SELECTED ITEMS");
        System.out.println("1   |   Rs. 200");
        System.out.println("2   |   Rs. 300");
        total =500;

    }

    @Override
    void doPayment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you pay in : CASH/CARD ?");
        String option = sc.nextLine();
        if(option.equals("CASH")){
            System.out.println("Paying "+total+" in cash");
        }else{
            System.out.println("Paying "+total+" in card");
        }
    }

    @Override
    void doDelivery() {
        System.out.println("Please collect package at counter");
    }
}
