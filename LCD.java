package com.demo;
public class LCD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n1=20;
			int n2=40, i=2;
			int max=n1>n2?n2:n1;
			//System.out.println(max);
			while(n1>i) {
				if(n1%i==0 && n2%i==0) {
						System.out.println(i);
						break;
				}
				i++;
			}
	}

}
