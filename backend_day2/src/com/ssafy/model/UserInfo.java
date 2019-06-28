package com.ssafy.model;

// 정보를 가지고 있을 JavaBeans --> VO(Value Object), DTO(Data Transfer Object)
public class UserInfo {
	// private member 변수
	private String id;
	private String name;
	private String pass;
	private String nick;
	// 기본 생성자
	public UserInfo() {}
	
	public UserInfo(String id, String name, String pass) {
		this.id = id;
		this.name = name;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", pass=" + pass + ", nick=" + nick + "]";
	}

	// setter/getter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	
}
