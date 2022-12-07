package com.demo;

public class Powers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		while(i<=4) {
			int j=1;
			int base=1;
			while(j<=i) {
				base=base*i;
				j++;
			}
			System.out.println(base);
			i++;
		}
		 
	 }
}