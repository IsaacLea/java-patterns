package patterns.creational.singleton;

/**
 * Singleton class using lazy loading with double-checked locking
 * This implementation is thread-safe and ensures that only one instance of the class is created
 * even when accessed by multiple threads simultaneously.
 */
public class SingletonClassLazyLoadMT {

	// the field needs to be volatile to prevent cache incoherence issues
    private static volatile SingletonClassLazyLoadMT instance;

    private SingletonClassLazyLoadMT() {
        // private constructor to prevent instantiation from outside
    }

    /**
     * Return the single instance of the class
     * This method is thread-safe and uses double-checked locking to ensure that only one instance is created 
     * @return
     */
    public static SingletonClassLazyLoadMT getInstance() {
    	
    	System.out.println("getInstance");
    	
    	// First check (no locking).  This is to avoid performance overhead of synchronization   	
        if (instance == null) { 
        	synchronized (SingletonClassLazyLoadMT.class) {
            	// Second check (with locking)
                if (instance == null) { 
                    instance = new SingletonClassLazyLoadMT();
                }
            }
        }
        
        return instance;
    }

    public void doSomething() {
        System.out.println("Doing something");
    }
}
