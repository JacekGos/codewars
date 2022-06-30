package main.six_kyu;

import java.util.Iterator;
import java.util.List;

public class SalesmanTravel {
	
	public static String travel(String r, String zipcode) {
		
		StringBuilder stringBldr = new StringBuilder();
		String[] addresses = r.split(",");
		
		stringBldr.append(zipcode);
		
		for (String address : addresses) {
			
			String[] addressParts = address.split(" ");
			String zipCodeFromAddress = addressParts[addressParts.length - 2] + " " + addressParts[addressParts.length - 1];
			
			if (zipCodeFromAddress.equals(zipcode)) {
				
				String streetAndCity = "";
				String number = addressParts[0];
				
				for (int i = 1; i < addressParts.length - 2; i++) {
					
					streetAndCity += addressParts[i] + " ";
				}
				
				System.out.println(number);
			}
		}
		
		
		
		return "end";
	}
	
}
