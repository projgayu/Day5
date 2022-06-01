package com.trng.statescapital;

import java.util.Iterator;
import java.util.Map;

public class UserMain2 {
	public static String getCaptials(Map<String,String>map,String input) {
		String ip="";
		Iterator<String>itr=map.keySet().iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			if(key.equals(ip))
			{
				ip=key;
			}
			
		}
		ip=map.get(ip)+"$"+ip;
		
		
		return ip;
	}

}

