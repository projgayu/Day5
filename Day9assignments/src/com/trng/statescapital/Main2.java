package com.trng.statescapital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		Map<String, String>map=new HashMap();
		System.out.println("enter the size");
		int size=scn.nextInt();
		System.out.println("enter the values");
		for (int i = 0; i < size; i++) {
			map.put(scn.next(),scn.next());
			
			
		}
		System.out.println("enter the input string");
		String ip=scn.next();
		System.out.println(UserMain2.getCaptials(map, ip));
	}

}
