package com.javaex.practice;

public class Ex09 {
	public static void main(String[] args) {
		int x,y;

		for(y=1; y<=10; y++) {
			for(x=0; x<=9; x++) {
				int result = y+x;
				System.out.print(result+"\t");
			}System.out.println("");
		}
	}
}
