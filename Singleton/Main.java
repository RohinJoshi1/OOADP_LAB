package Singleton;
import java.util.*;
/*
 * Singleton (Creational):
 *  A Browser’s history has data of all the visited URLs across all tabs and windows of a browser. 
 * The history is saved such that the data persists even after closing the browser. 
 * How would you use Singleton Pattern to implement Browser History such that on visiting a URL on 
 * any open tab of a browser the URL gets added to the existing history? 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Singleton inst = Singleton.getInstance();
        inst.visitPage("google.com");
        inst.visitPage("instagram.com");
        inst.getHistory();
        Singleton inst2 = Singleton.getInstance();
        inst.clearHistory();
        inst.getHistory();
    }
}
