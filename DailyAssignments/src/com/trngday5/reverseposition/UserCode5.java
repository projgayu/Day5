package com.trngday5.reverseposition;

public class UserCode5 {
	public static String getElements(String[] a, int fr) {
       
        for(int i =0 ;i < fr;i++){
            for(int j = i+1; j < fr ; j++ ){
                if(a[i].compareTo(a[j])>0) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
       
        System.out.println("Strings after sorting");
        for(int i = 0;i <= fr-1;i++) {
            System.out.println(a[i]);
        }
       
        System.out.println("String after reverse");
        for(int i = fr-1; i >=0 ;i--){
            System.out.println(a[i]);
}
		return null;
	}
	
}
