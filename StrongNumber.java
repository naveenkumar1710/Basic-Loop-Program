package com.demo;

public class StrongNumber {

	public static void main(String[] args) {
			int no=1024;
			int result=0;
			int noCopy=no;
			while(no>0) {
				int last =no%10;
				result=result+fact(last);
				no=no/10;
			}
			if(noCopy==result) {
				System.out.println("Strong number");
			}
			else {
				System.out.println("not a strong number");
			}
	}

	private static int fact(int last) {
		
		int result=1;
		int i=1;
		while(i<=last) {
			result=result*i;
			i++;
		}
		return result;
	}

}
