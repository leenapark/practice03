package com.javaex.practice;

import java.util.Scanner;

public class EX20 {
	public static void main(String[] args) {
		int random;
		int num = 63;
		boolean game = true;
		Scanner sc = new Scanner(System.in);


		while(game) {
			System.out.println("=========================");
			System.out.println("[ 숫자 맞추기 게임 시작 ]");
			System.out.println("=========================");
			System.out.print(">>");
			random = sc.nextInt();

			if(random>num) {
				System.out.println("더 낮게");
			}else if(random<num){
				System.out.println("더 높게");
			}else if(random==num) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n)  >>");
				char end = sc.next().charAt(0);

				if(end == 'y'){
					System.out.println("=======================");
					System.out.println("[숫자 맞추기 게임 종료]");
					System.out.println("=======================");
					break;
				}
			}
		}
		sc.close();
	}
}
