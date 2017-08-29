package com;

public class Multiplyby5 {
	public static void main(String[] arg) {
		int[] array = new int[10];
		/*array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		for( int i=0;i<array.length;i++){
		System.out.println(array[i]);	
		}*/
		int n = 5;
		int i;
		int number;
		for (i = 1; i <10; i++) {
		
				number = n * i;
				array[i] = number;
	 //System.out.print(array[i]);

			}
		
		
		for(int j = 0;j<array.length;j++){
			System.out.println(array[j]);
			
		}
	}

	private static char[] array(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}