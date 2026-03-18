package exam.codewriting;

import edu.princeton.cs.introcs.StdDraw;

public class Q01 {

	public static void recursiveCarpet ( double xCtr , double yCtr , double halfLength ) {
		//your code here	//how can i tell how far away the new squares are, do i just eyeball it? (ex. halfLength+0.02))
		if (halfLength<=0.05){
			return;
		}
		else {
			StdDraw.filledSquare(xCtr, yCtr, halfLength);
			recursiveCarpet(xCtr + halfLength, yCtr + halfLength, halfLength/2);
			recursiveCarpet(xCtr + halfLength, yCtr - halfLength, halfLength/2);
			recursiveCarpet(xCtr - halfLength, yCtr + halfLength, halfLength/2);
			recursiveCarpet(xCtr - halfLength, yCtr - halfLength, halfLength/2);
		}
	}

	public static void main(String[] args) {
		//Your task is to complete the above method to draw the image
		//shown in "image01.png" in the images folder.

		//Your solution must use recursion

		double halfCarpetLength = 0.25 ;
		recursiveCarpet ( 0.5 , 0.5 , halfCarpetLength ) ;
	}

}
