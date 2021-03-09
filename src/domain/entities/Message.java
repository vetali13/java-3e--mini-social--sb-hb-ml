package domain.entities;

public class Message implements HasAuthor, HasSentiment, IsChronological {
	int id;
	String body;
	User fromUser;
	User toUser;
	long createdAt;
	
	public Message() {
	}

	public Message(String body, User fromUser, User toUser) {
		this.body = body;
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.createdAt = System.currentTimeMillis();
	}

	public Message(int id, String body, User fromUser, User toUser, long createdAt) {
		this.id = id;
		this.body = body;
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.createdAt = createdAt;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public int getId() {
		return id;
	}

	public User getFromUser() {
		return fromUser;
	}

	public User getToUser() {
		return toUser;
	}

	public long getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return "Message [body=" + body + ", fromUser=" + fromUser + ", toUser=" + toUser + ", createdAt=" + createdAt
				+ "]";
	}
	
}
