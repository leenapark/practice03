package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		int select;
		int result = 0;
		int money = 0;
		Scanner sc = new Scanner(System.in);
		boolean action = true;
		
		while(action) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			select = sc.nextInt();
		
			if(select==1) {
				System.out.print("예금액>");
				money = sc.nextInt();
				result = result + money;
			}else if(select==2) {
				System.out.print("출금액>");
				money = sc.nextInt();
				result = result - money;
			}else if(select==3) {
				System.out.println("잔고>"+result);
			}else if(select==4) {
				System.out.println("종료");
				action = false;
			}else {
				System.out.println("다시 입력해주세요");
			}
			
		}
		sc.close();
	}
}
