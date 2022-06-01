package com.trng.idgenerator;

import java.util.HashMap;
import java.util.Map;

public class UserMain5 {
	

	private static String[] arr;

	public static String getStatedId(Map<String,String>map) {
		Map<String, String>map1=new HashMap();
		String[] str=new String[arr.length];
		for (int i = 0; i < str.length; i++) {
			str[i]=arr[i].substring(0,3).toUpperCase();
			
		}
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i],str);
			
		}
		
		
		
		return map;

}
}
