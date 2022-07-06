package main.six_kyu;

import java.util.Random;

public class ImageHost {

	public static String generateName(PhotoManager photomanager) {
		
		String result = getName();
		
		if (!photomanager.nameExists(result)) {
			
			do {
				
				result = getName();
				
			} while(photomanager.nameExists(result));
			
			return result;
		}
		
		return result;
	}
	
	private static String getName() {
		
		StringBuilder photoName = new StringBuilder();
		
		Random random = new Random();

		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (int i = 0; i < 6; i++) {
			
			photoName.append(alphabet.charAt(random.nextInt(alphabet.length())));
		}
		
		return photoName.toString();
	}
}
