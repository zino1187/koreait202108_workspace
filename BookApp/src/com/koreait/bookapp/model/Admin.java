package com.koreait.bookapp.model;

//아래의 클래스는 평상시와는 달리, 로직을 작성하기 위함이 아니라, 오직 DB의 레코드 한건을 담기 위한 
//용도의 객체이다. 이러한 목적으로 정의된 객체를 가리켜, 어플리케이션 분야에서는 VO(Value Object), DTO(Data Transfer Object)
public class Admin {
	private int admin_id;
	private String id;
	private String name;
	private String password;
	private String email;
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
