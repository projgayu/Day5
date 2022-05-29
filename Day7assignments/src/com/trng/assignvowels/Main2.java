package com.trng.assignvowels;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		int num =scn.nextInt();
		String[]str =new String[num];
		//ArrayList<String> v=new ArrayList<String>();
		for (int i = 0;i<num ; i++) {
			str[i] = scn.next();
			System.out.println(UserMain2.mathCharacter(str));
		}
		
	}
	

}
