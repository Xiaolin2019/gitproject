package com.nnxy.model;

public class StudentModel {
private int id;//编号
private String username;//用户名
private String password;//密码
private int sex;//性别
private int love;//爱好
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
