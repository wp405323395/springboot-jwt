package com.pjb.springbootjjwt.entity;



/**
 * @author jinbin
 * @date 2018-07-08 20:43
 */
public class User {
	private String Id;
    private String name;
    private String password;
    public User(String id, String name, String password) {
		super();
		Id = id;
		this.name = name;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", password=" + password + "]";
	}
	

}
