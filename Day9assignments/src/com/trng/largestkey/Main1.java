package com.trng.largestkey;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		Map<Integer,String>map=new HashMap();
		System.out.println("enter the size");
		int size=scn.nextInt();
		System.out.println("enter the values");
		for (int i = 0; i < size; i++) {
			map.put(scn.nextInt(),scn.next());
			
			
		}
		System.out.println(UserMain1.getMaxKeyValues(map));
	}

}
