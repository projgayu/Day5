package com.trngday5.removevowels;

import java.util.Scanner; 

public class Main4 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the string");
		String str=scn.next();
		String s=UserMain4.removeVowels(str);
		System.out.println(s);
	}

}
