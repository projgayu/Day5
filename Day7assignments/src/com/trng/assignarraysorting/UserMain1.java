package com.trng.assignarraysorting;

import java.util.ArrayList;
import java.util.Collections;

public class UserMain1 {
	public static ArrayList<Integer> addition1(ArrayList<Integer> a1, ArrayList<Integer> a2){
		a1.addAll(a2);
		Collections.sort(a1);
		ArrayList<Integer> ad=new ArrayList<Integer>();
		ad.add(a1.get(2));
		ad.add(a1.get(6));
		ad.add(a1.get(8));
		return ad;
	
	}
	}


