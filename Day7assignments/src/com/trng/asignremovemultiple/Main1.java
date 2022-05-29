package com.trng.asignremovemultiple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		
		int n=scn.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			al.add(scn.nextInt());
			}
		ArrayList<Integer>arr=UserMain3.getName(al);
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());}}

	}


