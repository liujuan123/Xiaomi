package com.yc.login.entity;


public class User {
	private int id;
	private String uname;
	private String upass;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	
	public void init(){
		System.out.println("我是初始化方法");
	}
	public void destroy(){
		System.out.println("我是销毁的方法");
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", upass=" + upass + "]";
	}
	public User() {
		System.out.println("===User无参构造===");
	}

	public User(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}
	
}
