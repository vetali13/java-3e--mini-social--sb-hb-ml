package domain.entities;

public class Sentiment implements HasAuthor, IsChronological {
	
	int id;
	SentimentEnum sentiment;
	User fromUser;
	long createdAt;
	
	public Sentiment() {
	}

	public Sentiment(SentimentEnum sentiment, User fromUser) {
		this.sentiment = sentiment;
		this.fromUser = fromUser;
		this.createdAt = System.currentTimeMillis();
	}

	public Sentiment(int id, SentimentEnum sentiment, User fromUser, long createdAt) {
		this.id = id;
		this.sentiment = sentiment;
		this.createdAt = createdAt;
	}

	public SentimentEnum getSentiment() {
		return sentiment;
	}

	public void setSentiment(SentimentEnum sentiment) {
		this.sentiment = sentiment;
	}

	public int getId() {
		return id;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return "Sentiment [id=" + id + ", sentiment=" + sentiment + ", createdAt=" + createdAt + "]";
	}
	
	
}
