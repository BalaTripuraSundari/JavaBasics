package com;

public class Reversenumber {
	public static void main(String[] arg){
		int n;
		int x;
		int a = 0;
		n = 2356;
		while(n>0){
			x = n % 10;
			a = a * 10 + x;
			n = n/10;
					
		}
	System.out.println(a);
	}

}
