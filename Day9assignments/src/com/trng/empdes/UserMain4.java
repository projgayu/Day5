package com.trng.empdes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UserMain4 {

	public static List obtainDesignation(Map<String,String>map,String input) {
			List list =new ArrayList();
			Iterator<String>itr=map.keySet().iterator();
			while(itr.hasNext()) {
				String key=itr.next();
				String value=map.get(key);
				//if(key.equals(ip))
				{
					list.add(key);
				}
	
	}
			return list;
	

}
}
