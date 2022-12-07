package com.demo;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="naveen";
        String rs="";
        int len=s.length()-1;
        while(len>=0){
            rs=rs+s.charAt(len);
              len=len-1;
        }
        if(s.equals(rs)){
             System.out.println("palindrome");
        }
        else{
             System.out.println("not a palindrome");
        }
	}

}
