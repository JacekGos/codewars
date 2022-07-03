package main.six_kyu;

import java.util.Arrays;
import java.util.stream.*;


public class StopSpinningMyWords {
	
	public static String spinWords(String sentence) {
		
		String[] sentenceArray = sentence.split(" ");
		StringBuilder result = new StringBuilder();
		
		for (String word : sentenceArray) {
			
			if (word.length() >= 5) {
				result.append(new StringBuilder(word).reverse() + " ");
			} else {
				result.append(word + " ");
			}
		}
		return result.deleteCharAt(result.length() - 1).toString();
		
//		other solution
//		return Arrays.stream(sentence.split(" "))
//				.map(i -> i.length() >= 5 ? new StringBuilder(i).reverse().toString() : i)
//				.collect(Collectors.joining(" "));
				
	}

}
