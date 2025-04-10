package patterns.behavioral.observer.plain;


import java.util.ArrayList;
import java.util.List;

/**
 * The NewsAgency class implements the Observer pattern. It maintains a list of observers (channels)
 * and notifies them whenever there is a change in the news.
 */
public class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channels) {
            channel.update(this.news);
        }
    }
}
