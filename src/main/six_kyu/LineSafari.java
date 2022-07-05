package main.six_kyu;

import java.util.Arrays;

public class LineSafari {

	public static double distanceFromLine(final int[] a, final int[] b, final int[] c) {
		
		double[] midpoint = new double[2];
		
		if (Arrays.equals(a, b)) {
			
			return Math.sqrt(Math.pow((a[0] - c[0]), 2) + Math.pow((a[1] - c[1]), 2));
		} else {
			
//			double c = (b[1] - a[1]) / (b[1] - a[1])
//			
//			return Math.sqrt(Math.pow((midpoint[0] - c[0]), 2) + Math.pow((midpoint[1] - c[1]), 2));
//			
			return 0;
		}
		
		
		
	}
}
