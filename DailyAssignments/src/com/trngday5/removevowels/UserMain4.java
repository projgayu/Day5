package com.trngday5.removevowels;

public class UserMain4 {
	public static String removeVowels(String str)
	{
		char[] ch=str.toCharArray();
		String s1="";
		for (int i = 0; i < ch.length; i++) {
			if(i%2==0)
			{
				s1=s1+ch[i];
				
			}
			else 
				if(i%2!=0)
				{
					if(ch[i]!='A'&& ch[i]!='a' && ch[i]!='E'&& ch[i]!='e' && ch[i]!='I'&& ch[i]!='i'&& ch[i]!='O'&& ch[i]!='o'&& ch[i]!='U'&& ch[i]!='u')
					{
						s1=s1+ch[i];
					}
			
		}
	}
		return s1;

}
}
