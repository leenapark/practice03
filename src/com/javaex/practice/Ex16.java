package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int count = 0, sum = 0;
		System.out.print("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		
		for(int i=1; i<=num; i++) {
			
			if(i%5==0) {
				count++;
				sum = sum + i;
			}
		}
		
		System.out.println("5의 배수의 개수: "+count);
		System.out.println("5의 배수의 개수: "+sum);
		sc.close();
	}
}
