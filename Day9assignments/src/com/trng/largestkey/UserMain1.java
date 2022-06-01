package com.trng.largestkey;

import java.util.Iterator;
import java.util.Map;

public class UserMain1 {
	public static String getMaxKeyValues(Map<Integer,String>map) {
		int n=0;
		Iterator<Integer>itr=map.keySet().iterator();
		while(itr.hasNext()) {
			int key=itr.next();
			if(key>n) {
				n=key;
		}
		}
		return map.get(n);
}
}
