package patterns.creational.singleton;

/**
 * Ensures that there is only ever one instance of this class.  It will get instantiated the first time the getInstance method is called
 * This is not thread-safe.  If multiple threads call getInstance at the same time, multiple instances of the class could be created.
 */
public class SingletonClassLazyLoad {

	private static SingletonClassLazyLoad instance;

    private SingletonClassLazyLoad() {
        // private constructor to prevent instantiation from outside
    }

    public static SingletonClassLazyLoad getInstance() {
        if (instance == null) {
            instance = new SingletonClassLazyLoad();
        }
        return instance;
    }
    
    public void doSomething() {
    	System.out.println("Doing something");
    }
    
}
