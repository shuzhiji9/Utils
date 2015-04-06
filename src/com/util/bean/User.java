package com.util.bean;

import java.io.Serializable;

import javax.persistence.Table;

@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = -5136101115842309010L;

	private Integer id;

	private String username;

	private String password;

	private String inserttime;

	private String logintime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInserttime() {
		return inserttime;
	}

	public void setInserttime(String inserttime) {
		this.inserttime = inserttime;
	}

	public String getLogintime() {
		return logintime;
	}

	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}

}
