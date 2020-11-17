package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		int dan, result;
		
		for(dan=1; dan<=9; dan++) {
			for(result=2; result<=9; result++) {
				System.out.print(result+"*"+dan+"="+result*dan+"\t");
			}System.out.println("");
		}
	}
}
