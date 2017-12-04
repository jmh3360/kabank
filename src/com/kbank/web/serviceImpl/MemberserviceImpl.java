package com.kbank.web.serviceImpl;

import java.util.Scanner;

import com.kabank.web.service.MemberService;
import com.kbank.web.bean.MemberBean;

public  class MemberserviceImpl implements MemberService {
	private MemberBean[] members;  // memberbean array는 MemberBean의 요소들의 내용을 닮고 있기에 더 큰 개념이라
	//생각 할 수 있다. 예 이름,나이,주민번호,계좌 등을 하나의 공간에 담을 수 있음.
	private int count ;
	

	
	public MemberserviceImpl(int count) {
		this.count = 0; //실행될때 한번만 초기화 되게끔 MemberserviceImpl = while 밖에 있어 한번만 실행
		members = new MemberBean[count];
	}
	@Override
	public int count() {
		return this.count;
	}
		@Override
	public void addMember(MemberBean member) {
		members[count] = member;
		count++;
		
	}
	@Override
	public String findGender(String ssn) {
		String foo = "";
		boolean inputOk = true;
		switch (ssn.charAt(7)) {
		case '1': case '3': foo = "남자"; break;
		case '2': case '4': foo = "여자"; break;
		case '5': case '7': foo = "외국인 남자"; break;
		case '6': case '8': foo = "외국인 여자"; break;
		
		default:
			foo = "몇살이세여? 1800년대 사람임?";
		}
		return foo;
	}
	@Override
		public int findAge(String ssn) {
			int myage = 0;
			int c = Integer.parseInt("" + ssn.charAt(0) + ssn.charAt(1)); 
			//("" + ssn.charAt(0) + ssn.charAt(1)) ""가 앞에 온 이유는 순차적으로 String 형변환으로 하기위해
			// ( ssn.charAt(0) + ssn.charAt(1) + "") 이런식의 형태로 된다면 ssn.charAt(0)은 int열로 바뀌긴 하지만
			// 아스키 코드로 선 변환되어 계산되어진다. 그래서 ""(String)이 앞에 와야한다
				switch(ssn.charAt(7)) {
				case '1' : case '2' : myage = 2017 - (1899 + c); break;
				case '3' : case '4' : myage = 2017 - (1999 + c); break;
				case '5' : case '6' : myage = 2017 - (1899 + c); break;
				case '7' : case '8' : myage = 2017 - (1999 + c); break;
				
				}
			return myage;
				 }
	@Override
	public MemberBean[] list() {
		return members;
	}
		}
	

	


	


	

