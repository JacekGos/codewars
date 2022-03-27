package seven_kyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidatePinCode {
	
	public static boolean validatePin(String pin) {
		
		//this solution pass \n which is not ok
		Pattern pattern = Pattern.compile("\\d{4}|\\d{6}");

		Matcher matcher = pattern.matcher(pin);

		return matcher.find();
	}

	//this solution is ok
	public static boolean validatePin3(String pin) {
		return pin.matches("\\d{4}|\\d{6}");
	}
	
}
