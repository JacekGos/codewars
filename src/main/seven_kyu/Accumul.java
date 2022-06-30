package main.seven_kyu;

public class Accumul {
	
	
	public static String accum(String s) {
		
		char[] charArray = s.toCharArray();
		
		StringBuilder result = new StringBuilder();
		
		result.append(Character.toUpperCase(charArray[0]) + "");
		
		for (int i = 1; i < charArray.length; i++ ) {
			
			result.append("-");

			for (int j = 0; j <= i; j++) {
				
				if (j == 0) {
					result.append(Character.toUpperCase(charArray[i]));
				} else {
					result.append(Character.toLowerCase(charArray[i]));
				}
			}
		} 
		
		
		return result.toString();
	}
}
