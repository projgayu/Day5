package com.trngday5.formnewword;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter a string");
		String s1=scn.next();
		System.out.println("enter a value");
		int n1=scn.nextInt();
		String str=UserMain3.formNewword(s1,n1);
		System.out.println(str);
		
	}

}
