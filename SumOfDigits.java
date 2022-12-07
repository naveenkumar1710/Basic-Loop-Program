package com.demo;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=99;
			int total=n;
			while(total>=10) {
				total=0;
				while(n>0){
					total=total+n%10;
					n=n/10;
				}
				n=total;
			}
			System.out.println(total);
	/*}
	void doWhile(){
		int n1=56;
		int a;
		do {
			a=0;
		do {
		a=a+n1%10;
		n1=n1/10;
	}*/
	}
}
