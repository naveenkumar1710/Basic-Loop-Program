package com.demo;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int no=3;
			int isPrime=0;
			int div=2;
			if(no<=1) {
				System.out.println("not a prime");
			}
			else {
				while(div<=no/2) {
					
					if(no%div==0) {
						isPrime=-1;
						break;
					}
					div=div+1;
				}
			
			if(isPrime==0) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not a prime");
			}
			}
	}

}
