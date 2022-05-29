package com.trng.assignvowels;

import java.util.ArrayList;

public class UserMain2 {
	public static ArrayList<String> mathCharacter(String[] str) {
		ArrayList<String> s=new ArrayList <String>();
		for (int i = 0; i < str.length ; i++) {
			System.out.println(str[i].charAt(0));
			System.out.println(str[i].charAt(str[i].length()-1));		
			//if(str[i].charAt(0)=='a'||str[i].charAt(0)=='e'||str[i].charAt(0)=='i'||str[i].charAt(0)=='o'||str[i].charAt(0)=='u' )&&(str[i].charAt(str[i].length()-1));
			System.out.println();
		}
		{
		}
		
		return null;
	}

}
