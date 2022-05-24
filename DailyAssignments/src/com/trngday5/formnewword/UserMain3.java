package com.trngday5.formnewword;

public class UserMain3 {
	public static String formNewword(String s1,int n1)
	{
		int n=2*n1;
		String s=new String();
		if(s1.length()>n)
		{
			s=s1.substring(0,n1)+s1.substring(s1.length()-n1,s1.length());
			return s;
			
			
		}
		else
			return null;
	}

}
