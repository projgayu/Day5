package com.trng.assignstringarray;

import java.util.ArrayList;
import java.util.Iterator;

public class UserMainCode4 {

	public static String[] convertToStringArray (ArrayList<String> l1,int n)
	{
		String a[]=new String[n];
		int i=0;
		Iterator<String> it=l1.iterator();
		while(it.hasNext()){a[i]=it.next();
		++i;
		}
		return a;
		}

}
