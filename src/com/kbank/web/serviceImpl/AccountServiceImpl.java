package com.kbank.web.serviceImpl;

import java.util.Random;
import java.util.Scanner;

public class AccountServiceImpl {
	private String name;
	private int accountnum;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAccountNum() {
		Random r = new Random();
		
		// 100000 ~ 999999
		boolean flag = true;
		while (flag) {
			int temp = r.nextInt(1000000);
			if (temp > 100000) {
				flag = false;
				this.accountnum = temp;
			}
		}
	}

	public int getAccountNum() {
		return this.accountnum;
	}

}
