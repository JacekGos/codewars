package seven_kyu;

import java.util.stream.Collectors;

public class DigitsExplosion {

	public static String explode(String digits) {
		
		String result = "";
		
//		digits.chars().mapToObj(ch -> (char) ch)
//			.forEach(System.out::println);
		
		for (int i = 0; i < digits.length(); i++) {
			
			int currentNumber = Character.getNumericValue(digits.charAt(i));
			
			if (currentNumber > 0) {
				
				for (int j = 0; j < currentNumber; j++) {
					
					result += "" + currentNumber;
				}
			}
		}
			
		return result;
	}
	
	//best practice
	public static String explode2(String digits) {
		
		return digits.chars().mapToObj(c -> Integer.toString(c - '0').repeat(c - '0'))
				.collect(Collectors.joining());
	}

}
