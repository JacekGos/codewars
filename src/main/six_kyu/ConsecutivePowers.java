package main.six_kyu;

import java.util.ArrayList;
import java.util.List;

public class ConsecutivePowers {

	public static List<Long> sumDigPow(long a, long b) {

		List<Long> result = new ArrayList<Long>();

		for (long i = a; i <= b; i++) {

			if (i < 10) {
				
				if (Math.pow(i, 1) == i) {

					result.add(i);
				}
			} else {
				
				String numberString = String.valueOf(i);
				char[] digits = numberString.toCharArray();
				double digitResult = 0;
				
				for (int j = 0; j < digits.length; j++) {
					
					double number = Character.digit(digits[j], 10);
					digitResult += (double)Math.pow(number, j + 1);
				}
				
				if (digitResult == i) {
					result.add(i);
				}
			}
		}

		return result;
	}
}
