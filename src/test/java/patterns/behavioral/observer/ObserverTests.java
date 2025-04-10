package patterns.behavioral.observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import patterns.behavioral.observer.javaobserver.ONewsAgency;
import patterns.behavioral.observer.javaobserver.ONewsChannel;
import patterns.behavioral.observer.plain.NewsAgency;
import patterns.behavioral.observer.plain.NewsChannel;
import patterns.behavioral.observer.propertychangelistener.PCLNewsAgency;
import patterns.behavioral.observer.propertychangelistener.PCLNewsChannel;

class ObserverTests {

	@Test
	void testPlainObserver() {
		NewsAgency observable = new NewsAgency();
		NewsChannel observer = new NewsChannel();

		// Test that the observer is notified when the observable changes
		observable.addObserver(observer);
		observable.setNews("news");
		assertEquals(observer.getNews(), "news");
	}
	
	@Test
	void testJavaObserver() {
		ONewsAgency observable = new ONewsAgency();
		ONewsChannel observer = new ONewsChannel();

		// Test that the observer is notified when the observable changes
		observable.addObserver(observer);
		observable.setNews("news");
		assertEquals(observer.getNews(), "news");
	}
	
	@Test
	void testPCLObserver() {
		// Test that the observer is notified when the observable changes
		PCLNewsAgency observable = new PCLNewsAgency();
		PCLNewsChannel observer = new PCLNewsChannel();
		observable.addPropertyChangeListener(observer);
		observable.setNews("news");
		assertEquals(observer.getNews(), "news");
	}

}
