package com.trng.assignarraymanipulate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main6 {
	

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		
		int s = Integer.parseInt(scn.nextLine());
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for (int i = 0; i < s; i++)
		al1.add(scn.nextInt());
		for (int i = 0; i < s; i++)
		al2.add(scn.nextInt());
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3 = display (al1, al2);
		//ArrayList<Integer> a10=UserMain.display(s,al3);
		
		
		Iterator<Integer> it = al3.iterator();
		while (it.hasNext()) {
		int n = it.next();
		System.out.println(n);
		}
		}

	private static ArrayList<Integer> display(ArrayList<Integer> al1, ArrayList<Integer> al2) {
		// TODO Auto-generated method stub
		return null;
	}
		
	}


