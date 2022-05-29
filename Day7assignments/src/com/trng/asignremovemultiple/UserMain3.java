package com.trng.asignremovemultiple;

import java.util.ArrayList;
import java.util.Iterator;

public class UserMain3 {
	public static ArrayList<Integer>getName(ArrayList<Integer> al)
	{
		ArrayList<Integer> array=new ArrayList<Integer>();
				;Iterator<Integer> it=al.iterator();
				while(it.hasNext())
				{
					array.add(it.next());
					array.add(it.next());
					it.next();
					}
				return array;
				}
	}


