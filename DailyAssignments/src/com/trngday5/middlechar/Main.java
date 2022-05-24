package com.trngday5.middlechar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String str =scn.next();
		String s1=UserMainCode.getMidChar(str);
		System.out.println(s1);
	}

}
