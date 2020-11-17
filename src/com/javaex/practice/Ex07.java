package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int no = sc.nextInt();
		int x, y;
		
		for(x=1; x<=no; x++) {
			for(y=1; y<=x; y++) {
				System.out.print(x);
			}
			System.out.println("");
		}
		
		/*
		x=1일 때 x가 no만큼 반복하며 x는 증가함
		y가 1일 때 y는 x만큼 반복하며 y는 증가함
		여기서 y는 x 만큼 증가하고 x는 no만큼 증가함
		y -> x -> no
		*/
		sc.close();
	}
}
