package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int x, y, z;
	
		for(x=1; x<=num; x++) {
			for(y=num; y>=x; y--) {
				System.out.print("*");
			}System.out.println("");
		}
		for(x=2; x<=num; x++) {
			for(z=1; z<=x; z++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		sc.close();
	}
}
