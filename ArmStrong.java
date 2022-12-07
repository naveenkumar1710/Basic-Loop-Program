package com.demo;
import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter the number to check");
			int a=Sc.nextInt();
			int b=a;
			int total=0;
			while(a>0) {
				int result=a%10;
				total=total+(result*result*result);
				a=a/10;
			}
			if(total==b) {
				System.out.println("arm Strong num");
			}
			else {
				System.out.println("not a ArmStrong");
			}
	}

}
