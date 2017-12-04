package com.kbank.web.bean;

public class MemberBean {
	private int customNum; // customNum은 멤버변수
	private String name;
	private int age;
	private String gender;
	private String ssn;

	public void setCustomNum(int customnum) {
		this.customNum = customnum;
	}

	public int getCustomNum() {
		return this.customNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return this.gender;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSsn() {
		return this.ssn;
	}
}