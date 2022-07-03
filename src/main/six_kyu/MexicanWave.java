package main.six_kyu;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

	public static String[] wave(String str) {

		List<String> resultArray = new ArrayList<String>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				continue;
			}

			resultArray.add(str.substring(0, i) + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1));
		}

		return resultArray.toArray(new String[0]);
	}

}
