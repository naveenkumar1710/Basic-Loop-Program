package com.demo;
import java. util.Scanner;
public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("pls enter the text");
	String name=Sc.next();
	int len=name.length()-1;
	while(len>=0) {
		name.charAt(len);
		System.out.print(name.charAt(len));
		len=len-1;
	}
	}

}
