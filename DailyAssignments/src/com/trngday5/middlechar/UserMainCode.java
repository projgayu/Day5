package com.trngday5.middlechar;

public class UserMainCode {
	public static String getMidChar(String s)
	{
		StringBuffer sb=new StringBuffer();
		if(s.length()%2==0)
		{
			sb.append(s.substring((s.length()/2)-1,(s.length()/2)+1));
			
		}
		return sb.toString();
	}

}
