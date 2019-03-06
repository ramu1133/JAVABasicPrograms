package com.BasicPrograms;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int n= 14421, sum = 0, temp;
		temp = n;
		
		while(n>0)
		{
			int r = n%10;
			sum = (sum*10)+r;
			n= n/10;
		}
		
		if(temp == sum){
			System.out.println(temp+" is a palindrome");
		}else{
			System.out.println(temp+" is not a palindrome");
		}			
				
	}

}
