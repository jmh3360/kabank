package com.kabank.web.controller;

import java.util.Scanner;
import java.util.Vector;

import javax.swing.JOptionPane;

import com.kabank.web.service.MemberService;
import com.kbank.web.bean.MemberBean;
import com.kbank.web.serviceImpl.AccountServiceImpl;
import com.kbank.web.serviceImpl.MemberserviceImpl;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AccountServiceImpl accountService = new AccountServiceImpl();
		MemberService memberService = new MemberserviceImpl();
		MemberBean member = null;
		while (true) {

			switch (JOptionPane.showInputDialog("[MENU] 0.종료 1.회원 가입2.계좌 개설3.총 회원수 4. 회원목록"
					+ "5.로그인"
					+ "6.회원 탈퇴"
					+ "9.회원전체 삭제")) {
			case "0":System.out.println("종료");return;
			case "1":
				//String spec = JOptionPane.showInputDialog("이름/주민번호/id/pass");
				//String[] arr = spec.split("/");
				String spec = JOptionPane.showInputDialog("이름/주민번호/id/pass");
				String[] dummy = {
						"홍길동/800101-123456/hong/1",
						"김유신/900203-134567/kim/1",
						"이이/920304-189456/lee/1",
						"유관순/850910-223456/you/1",
						"신사임당/950101-273456/shin/1"
				};
				for(int i=0;i<dummy.length;i++) {
					member = new MemberBean();
					String[] arr = dummy[i].split("/");
			
				member.setName(arr[0]);
				member.setSsn(arr[1]);
				member.setId(arr[2]);
				member.setPass(arr[3]);
				memberService.addMember(member);
				
				member.setGender(memberService.findGender(member.getSsn()));
				member.setAge(memberService.findAge(member.getSsn()));

				}
				break;
			
			case "2": 
				System.out.println("이름");
				accountService.setName(scanner.next());
				accountService.setAccountNum();
				//int res = accountService.createAccount(scanner);
				System.out.println(
						 "[이름]" + accountService.getName()
						+"[계좌번호]" + accountService.getAccountNum()
				);
				
			break;
			
			
			case "3": 
			JOptionPane.showMessageDialog(null, "총회원 수는?"+ memberService.count());
				break;
			
			case "4": 
				JOptionPane.showMessageDialog(null, memberService.list());
				break;
			case "5" :
				break;
			case "6" :
				memberService.delete(JOptionPane.showInputDialog("삭제할 id를 입력하세요."));
				
				break;
			case "9":
				memberService.totalDel();
				System.out.println("삭제완료");
				break;
				
			}
		}
	}
}
