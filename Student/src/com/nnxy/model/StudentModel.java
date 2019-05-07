package com.nnxy.model;

public class StudentModel {
private int id;
private String username;
private String password;
private int sex;
private int love;
public StudentModel(int id, String username, String password, int sex, int love) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.sex = sex;
	this.love = love;
}
public int getId() {
	return id;
}
public void setId(int id) {
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
public int getSex() {
	return sex;
}
public void setSex(int sex) {
	this.sex = sex;
}
public int getLove() {
	return love;
}
public void setLove(int love) {
	this.love = love;
}

}
