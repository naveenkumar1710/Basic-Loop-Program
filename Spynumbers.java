package com.demo;

public class Spynumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int no=22;
			int a=0;
			int b=1;
			while(no>0) {
				int i=no%10;
				a=a+i;
				b=b*i;
				no=no/10;
				//System.out.println(no);
			}
			if(a==b) {
				System.out.println("spy number");
			}
			else {
				System.out.println("not a spy number");
			}
	}

}
