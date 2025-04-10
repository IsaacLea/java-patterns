package patterns.creational.singleton;

/**
 * Ensures that there is only ever one instance of this class.  It will get instantiated immediately
 * when using Spring, beans are by default singleton so simply adding the @Component annotation to a class and using it as a bean does the same thing
 */
public class SingletonClassEagerLoad {

	private static final SingletonClassEagerLoad instance = new SingletonClassEagerLoad();

    private SingletonClassEagerLoad() {
        // private constructor to prevent instantiation from outside
    }

    public static SingletonClassEagerLoad getInstance() {        
        return instance;
    }
    
    public void doSomething() {
    	System.out.println("Doing something");
    }
    
}
