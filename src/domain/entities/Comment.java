package domain.entities;

public class Comment implements HasAuthor, HasSentiment, IsCommentable, IsChronological{

	int id;
	String body;
	User fromUser;
	long createdAt;
	
	public Comment() {
	}

	public Comment(String body, User fromUser) {
		this.body = body;
		this.fromUser = fromUser;
		this.createdAt = System.currentTimeMillis();
	}

	public Comment(int id, String body, User fromUser, long createdAt) {
		this.id = id;
		this.body = body;
		this.fromUser = fromUser;
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

	public long getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", body=" + body + ", fromUser=" + fromUser + ", createdAt=" + createdAt + "]";
	}
	
	
}
