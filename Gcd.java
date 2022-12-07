package com.demo;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n1=8;
			int n2=12;
			int min=n1>n2?n2:n1;
			//System.out.println(min);
			while(n1>1) {
				if(n1%min==0) {
					if(n2%min==0) {
						System.out.println(min);
						break;
					}
				}
				min--;
			}
	}

}
