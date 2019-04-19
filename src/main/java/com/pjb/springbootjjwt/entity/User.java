package com.pjb.springbootjjwt.entity;



/**
 * @author jinbin
 * @date 2018-07-08 20:43
 */
public class User {
	private String Id;
    private String username;
    private String password;
    public User(String id, String username, String password) {
		super();
		Id = id;
		this.username = username;
		this.password = password;
	}
	public User() {
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
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
	@Override
	public String toString() {
		return "User [Id=" + Id + ", username=" + username + ", password=" + password + "]";
	}
	

}
