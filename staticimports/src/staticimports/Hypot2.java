package staticimports;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Hypot2 {
	public static void main(String[] args) {
		double side1, side2;
		double hypot;
		
		side1 = 3.0;
		side2 = 4.0;
		
		hypot = sqrt(pow(side1, 2) + pow(side2, 2));
		
		System.out.println("Given sides of lengths " +
							side1 + " and " + side2 +
							" the hypotenuse is " +
							hypot);
	}
}
