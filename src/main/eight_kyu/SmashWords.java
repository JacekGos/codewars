package main.eight_kyu;

public class SmashWords {

	public static String solution(String[] words) {
		
		if (words.length == 0) {
			return "";
		}
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(words[0]);
		
		for (int i = 1; i < words.length; i++) {
			
			stringBuffer.append(" " + words[i]);
		}
		
		return stringBuffer.toString();
		
		//better solutions
//		return String.join(" ", words);
		
//		return words != null ? String.join(" ", words) : "";
	}
}
