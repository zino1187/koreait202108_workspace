package com.koreait.bookapp.model;

//이 객체는 오직 하나의 레코드를 담기위한 데이터를 담는 용도로 정의함 VO
public class TopCategory {
	private int topcategory_id;
	private String name;
	
	public int getTopcategory_id() {
		return topcategory_id;
	}
	public void setTopcategory_id(int topcategory_id) {
		this.topcategory_id = topcategory_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
