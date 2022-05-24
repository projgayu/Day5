package com.trngday5.checkchar;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
	
	Scanner scn=new Scanner(System.in);
	String str =scn.nextLine();
	String s1=UserMain.checkChar(str);
	System.out.println(s1);
	}

}
