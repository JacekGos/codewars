package main.six_kyu;


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
	}

}
