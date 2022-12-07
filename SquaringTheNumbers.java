package com.demo;

public class SquaringTheNumbers {
	static int square(int base,int times) {
		int result=1;
		while(times>0) {
			result=result*base;
			times=times-1;
		}
		System.out.println(result);
		return result;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			square(2,5);
	}

}
