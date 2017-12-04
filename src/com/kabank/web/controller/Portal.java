package com.kabank.web.controller;

import java.util.Scanner;

import com.kabank.web.service.MemberService;
import com.kbank.web.bean.MemberBean;
import com.kbank.web.serviceImpl.AccountServiceImpl;
import com.kbank.web.serviceImpl.MemberserviceImpl;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("회원수 입력");
		AccountServiceImpl accountService = new AccountServiceImpl();
		MemberService memberService = new MemberserviceImpl(scanner.nextInt());
		MemberBean member = null;
		while (true) {
			System.out.println("[MENU] 0.종료 1.회원 가입2.계좌 개설3.총 회원수 4. 회원목록");

			switch (scanner.nextInt ()) {
			case 0:System.out.println("종료");return;
			case 1:
				member = new MemberBean();
				System.out.println("이름");
				member.setName(scanner.next());
				System.out.println("주민");
				member.setSsn(scanner.next());
				memberService.addMember(member);
				member.setGender(memberService.findGender(member.getSsn()));
				member.setAge(memberService.findAge(member.getSsn()));

				System.out.println(""
						+ "[고객번호]" +member.getCustomNum()
						+ "[주민번호]" +member.getSsn()
						+ "[이름]" + member.getName()
						+ "[성별]" + member.getGender()
						+ "[나이]" + member.getAge()
						);
				break;
			
			case 2: 
				System.out.println("이름");
				accountService.setName(scanner.next());
				accountService.setAccountNum();
				//int res = accountService.createAccount(scanner);
				System.out.println(
						 "[이름]" + accountService.getName()
						+"[계좌번호]" + accountService.getAccountNum()
				);
				
			break;
			
			
			case 3: 
			System.out.println("총학생 수는?"+ memberService.count());
				break;
			
			case 4: 
				MemberBean[] members = memberService.list();
				for(int i = 0; i<members.length;i++) {
					System.out.println(members[i].getName() + members[i].getSsn() + members[i].getGender() + members[i].getAge());
				}
				break;
			}
		}
	}
}
