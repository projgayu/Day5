package com.trng.empdes;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Map<String,String>map=new HashMap();
		System.out.println("enter the size");
		int size=scn.nextInt();
		System.out.println("enter the value");
		for (int i = 0; i < size; i++) {
			map.put(scn.next(),scn.next());
			
			
		}
		System.out.println("enter i/p");
		String ip=scn.next();
		List list=UserMain4.obtainDesignation(map,ip);
		//Collection.sort(list);
		for (Object o : list) {
			System.out.println(o);
			
		}
		
		
	}
	

}
