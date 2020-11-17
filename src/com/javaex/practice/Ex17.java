package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int star = sc.nextInt();
		int x, y;
		
		for(x=star; x>=1; x--) {
			for(y=1; y<=x; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
