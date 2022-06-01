package com.trng.maxadm;

import java.util.Iterator;
import java.util.Map;

public class UserMain3 {

	public static Integer  getYear(Map<Integer,Integer>map) {
		int y=0;
		int a=0;
		Iterator<Integer>itr=map.keySet().iterator();
		while(itr.hasNext()) {
			int key=itr.next();
			int values=map.get(key);
			if(y<values) {
				y=values;
				a=key;
			}
			}
	
		return a;
	}

}
