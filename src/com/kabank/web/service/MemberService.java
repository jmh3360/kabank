package com.kabank.web.service;

import com.kbank.web.bean.MemberBean;

public interface MemberService {
	public void addMember(MemberBean member);
	public String findGender(String ssn);
	public int findAge(String ssn);
	public MemberBean[] list();
	public int count();
}
