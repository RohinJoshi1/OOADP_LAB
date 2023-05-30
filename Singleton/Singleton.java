package Singleton;
import java.util.*;
/*
 * A single instance to store the state(LinkedList of urls)
 */
public class Singleton {
    private static volatile Singleton instance; //Ensure cache for instance is not stored
    private static ArrayList<String> history=new ArrayList<>();
    //DCL
    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        else{
            System.out.println("Already created");
        }
        return instance;
    }
    public void visitPage(String url){
        this.history.add(url);
    }
    public void getHistory(){
        for(String s:history){
            System.out.println(s);
        }
    }
    public void clearHistory(){
        this.history.clear();
        System.out.println("Cleared");
    }
}

/*
 * synchronized (LazyRegistryWithDCL.class) {
				if(INSTANCE == null) {
					INSTANCE = new LazyRegistryWithDCL();				
				}
			}
 */