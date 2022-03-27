package seven_kyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidatePinCode {
	
	public static boolean validatePin(String pin) {
		
//		Pattern pattern = Pattern.compile("^\\d{4}$|^\\d{6}$");
		Pattern pattern = Pattern.compile("^\\s-");
		
		Matcher matcher = pattern.matcher(pin);
		
	    return matcher.find();
	  }
}
