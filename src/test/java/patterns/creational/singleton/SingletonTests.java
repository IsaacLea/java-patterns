package patterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTests {

	@Test
	void testSingletonClassEagerLoad() {
		// Test SingletonClassEagerLoad
		SingletonClassEagerLoad instance1 = SingletonClassEagerLoad.getInstance();
		SingletonClassEagerLoad instance2 = SingletonClassEagerLoad.getInstance();
		
		assertNotNull(instance1);
		assertSame(instance1, instance2, "SingletonClassEagerLoad instances should be the same");
		
		instance1.doSomething();
		
	}
	
	@Test
	void testSingletonClassLazyLoad() {
		// Test SingletonClassLazyLoad
		SingletonClassLazyLoad instance1 = SingletonClassLazyLoad.getInstance();
		SingletonClassLazyLoad instance2 = SingletonClassLazyLoad.getInstance();
		
		assertNotNull(instance1);
		assertSame(instance1, instance2, "SingletonClassLazyLoad instances should be the same");
		
		instance1.doSomething();
		
	}
	
	@Test
	void SingletonClassLazyLoadMT() {
		// Test SingletonClassLazyLoadMT
		SingletonClassLazyLoadMT instance1 = SingletonClassLazyLoadMT.getInstance();
		SingletonClassLazyLoadMT instance2 = SingletonClassLazyLoadMT.getInstance();
		
		assertNotNull(instance1);
		assertSame(instance1, instance2, "SingletonClassLazyLoadMT instances should be the same");

		assertNotNull(instance1);
		
		instance1.doSomething();
		
	}

}
