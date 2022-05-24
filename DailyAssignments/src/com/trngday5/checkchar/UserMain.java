package com.trngday5.checkchar;

public class UserMain {
	public static String checkChar(String str)
	{
	if(str.charAt(0)==str.charAt(str.length()-1))
	{
		return"valid";
		
	}
	else {
		return "invalid";
	}

}
}