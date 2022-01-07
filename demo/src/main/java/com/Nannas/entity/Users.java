package com.Nannas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {

	@Column(name ="first_name")
	private String firstName;

	@Column(name="email")
	private String email;
	
	@Id
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	

	public Users(String firstName, String email, String userName, String password) {
		super();
		this.firstName = firstName;
		this.email = email
		this.userName = userName;
		this.password = password;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() { return firstName }

	public void setFirstName(String firstName) { this.firstName = firstName; }

	public String getEmail() { return email }

	public void setEmail(String email) { this.email = email; }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
