package seven_kyu;

import java.util.HashSet;

public class CharacterCounter {

	public static boolean validateWord(String word) {
		
		HashSet<Integer> charsCount = new HashSet<>();

		word.toLowerCase().chars().mapToObj(ch -> Character.toString(ch))
			.forEach((ch) -> {
				
				int count = word.length() - word.toLowerCase().replace(ch, "").length();
				charsCount.add(count);

				System.out.println(ch + ": " + count);
			});
		
		for (int item : charsCount) {
			System.out.println(item);
		}
		
		return charsCount.size() <= 1;
	}
}
