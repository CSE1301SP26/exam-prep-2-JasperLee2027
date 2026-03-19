package exam.codewriting;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Q05 {

	/*
	For this problem we wish to construct a method named countValue that will count and
	return the number of times a particular value appears in an integer array. For example if you were given
	an array:
	
	int [] a = {1, 3, 1};
	
	The call to countValue(a, 1) would return 2, however the call to countValue(a, 9) would return 0.
	You should assume that the array given as an input could be any size, and your method should work
	appropriately. It is not necessary to use recursion for this problem. Complete the method below:
	*/
	public static int countValue (int[] a, int findMe ) {
		//my code (iteration)
		int count = 0;
		for (int i=0; i<a.lenght; i++) {
			if (a[i]== findMe) {
				count++;
			}
		}
		return count;
	}
		//my code2 (recursion)
   	public static int countValue (int[] a, int findMe ) {
		return countHelper(a, findMe, 0);
	}
		
	private static int countHelper(int[] a, int findMe, int index) {
		if (index >= a.length) {
	        return 0;
	    }
	    if (a[index] == findMe) {
	        return 1 + countHelper(a, findMe, index + 1);
	    } 
		else {
	        return countHelper(a, findMe, index + 1);
	    }
	}	
	


	public static void main ( String[] args ) {
		int[] a = {1, 3, 1};
		System.out.println(countValue(a, 1));
	}

}
