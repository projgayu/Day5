package com.trng.assignstringarray;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		
		
		int k1=Integer.parseInt(scn.nextLine());
		ArrayList<String> l1=new ArrayList<String>();
		for(int i=0;i<k1;i++){l1.add(scn.next());
		}
		String []s=UserMainCode4.convertToStringArray(l1,k1);
		for(String s1:s){
			System.out.println(s1);
		}
	}

}
