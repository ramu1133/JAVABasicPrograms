package com.BasicPrograms;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int n=153, val=0, temp, r;
		temp = n;
		
		while(n>0){
			r = n%10;
			n=n/10;
			val = val + (r*r*r);
		}
		
		if(temp == val){
			System.out.println(temp+" is armstrong number");
		}else{
			System.out.println(temp+" is not an armstrong number");
		}
		
	}

}
