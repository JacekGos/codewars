package six_kyu;

import java.util.ArrayList;
import java.util.List;

public class Vowels {

	public static int getCount(String str) {
		
		long count = str.chars().filter(ch -> 
			ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u').count();
		
		int vowelsCount = (int) count;
		
		return vowelsCount;
	}
	
	
	//best practices
//	public static int getCount(String str) {
//		return str.replaceAll("(?i)[^aeiou]", "").length();
//	}

}
