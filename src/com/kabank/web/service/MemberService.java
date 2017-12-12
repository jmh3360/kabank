package com.kabank.web.service;

import java.util.Vector;

import com.kbank.web.bean.MemberBean;

public interface MemberService {
	public void addMember(MemberBean member);
	public String findGender(String ssn);
	public int findAge(String ssn);
	public Vector<MemberBean> list();
	public int count();
	public void totalDel();
	public void delete(String id);
	//public String login(String id, String pass);
	public String login(MemberBean member);
	public MemberBean findById(String string);
	public int createCustomNum();
	public void updatePassword(String pass);
	public void deleteMyId();
	public Vector <MemberBean> findByName(String string);
}
