package patterns.behavioral.observer.propertychangelistener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * The PCLNewsChannel class implements the Observer pattern using Java's PropertyChangeListener.
 * It listens for changes in the news and updates its state accordingly.
 */
public class PCLNewsChannel implements PropertyChangeListener {

    private String news;

    public void propertyChange(PropertyChangeEvent evt) {
        this.setNews((String) evt.getNewValue());
    }

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

}
