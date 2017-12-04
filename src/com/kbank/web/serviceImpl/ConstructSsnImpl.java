package com.kbank.web.serviceImpl;

import java.util.Random;

public class ConstructSsnImpl {
	public void findCount(){
		// 주민등록 번호 자동생성기
		Random r1 = new Random();
		int temp1= 0;
		int res =0;
		temp1=r1.nextInt(10000000);
		while(true) {
		if(temp1<=999999||temp1>=100000)
		{
			res = temp1;
		}else if(temp1<=9999999||temp1>=1000000){
		res = temp1;
		}
	}
	
	
	}
}