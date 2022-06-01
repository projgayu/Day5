package com.trng.idgenerator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main5 {
		public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			//Map<String,String>map=new HashMap();
			System.out.println("enter the size");
			int size=scn.nextInt();
			String[] arr=new String[size];
			System.out.println("enter the value");
			for (int i = 0; i < arr.length; i++) {
				arr[i]=scn.next();
				
			}
			Map<String,String>map=(UserMain5.getStatedId);
			Iterator<String> itr=map.keySet().iterator();
			while(itr.hasNext()) {
				String key=itr.next();
				String value=map.get(key);
				System.out.println(values);
				System.out.println(key);
				
			}
			}

}
		
