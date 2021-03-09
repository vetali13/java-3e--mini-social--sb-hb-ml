package domain.entities;

import java.awt.image.BufferedImage;

public class User implements IsCommentable {
	int id;
	String username;
	String email;
	BufferedImage avatar;
	int age;
	
	public User() {
	}

	public User(String username, String email) {
		this.username = username;
		this.email = email;
	}

	public User(String username, String email, BufferedImage avatar) {
		this(username, email);
		this.avatar = avatar;
	}

	public User(String username, String email, BufferedImage avatar, int age) {
		this(username, email, avatar);
		this.age = age;
	}

	public User(int id, String username, String email, BufferedImage avatar, int age) {
		this(username, email, avatar, age);
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BufferedImage getAvatar() {
		return avatar;
	}

	public void setAvatar(BufferedImage avatar) {
		this.avatar = avatar;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", age=" + age + "]";
	}
	
}
