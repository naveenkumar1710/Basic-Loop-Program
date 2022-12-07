package com.demo;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int result=a*a;
		int base=0;
		int total=0;
		while(result>0) {
			base=result%10;
			total=total+base;
			result=result/10;
		}
		if(a==total) {
			System.out.println("neon number");
		}
		else {
			System.out.println("not a neon number");
		}
	}

}
