package com.trng.maxadm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Map<Integer,Integer>map=new HashMap();
		System.out.println("enter the size");
		int size=scn.nextInt();
		System.out.println("enter the value");
		for (int i = 0; i < size; i++) {
			map.put(scn.nextInt(),scn.nextInt());
			
			
		}
		System.out.println(UserMain3.getYear(map));
		
		
				
	}

}
