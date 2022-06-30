package main.seven_kyu;

import static java.util.stream.IntStream.rangeClosed;

public class StrongNumber {

	public static String isStrongNumber(int num) {
		
//		int result = 0;
//		
//		for (char number : String.valueOf(num).toCharArray()) {
//			
//			int strongResult = 1;
//			
//			for (int i = 1; i <= Character.getNumericValue(number); i++) {
//				
//				strongResult *= i;
//			}
//			
//			result += strongResult;
//		}
//		
//		return result == num ? "STRONG" : "NOT_STRONG";
		
		return (num + "").chars().map(Character::getNumericValue)
				.map(i -> rangeClosed(1, i).reduce(1, (a, b) -> a * b))
				.sum() == num ? "STRONG!!!!" : "Not Strong !!";
		
	}

}
