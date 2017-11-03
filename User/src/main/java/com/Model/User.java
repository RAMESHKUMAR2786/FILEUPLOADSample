package com.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DUMMY")
public class User {

	private int id;
	private String userName;
	private String userCatagory;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCatagory() {
		return userCatagory;
	}

	public void setUserCatagory(String userCatagory) {
		this.userCatagory = userCatagory;
	}

}
