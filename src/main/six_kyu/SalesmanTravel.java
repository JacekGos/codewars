package main.six_kyu;

import java.util.Iterator;
import java.util.List;

public class SalesmanTravel {

	public static String travel(String r, String zipcode) {

		StringBuilder result = new StringBuilder(zipcode + ":");
		StringBuilder streetsAndCities = new StringBuilder();
		StringBuilder addressesNumbers = new StringBuilder("/");
		
		for (String address : r.split(",")) {

			String[] addressParts = address.split(" ");
			String zipCodeFromAddress = addressParts[addressParts.length - 2] + " "
					+ addressParts[addressParts.length - 1];

			StringBuilder streetAndCity = new StringBuilder();

			if (zipCodeFromAddress.equals(zipcode)) {

				addressesNumbers.append(addressParts[0] + ",");

				for (int i = 1; i < addressParts.length - 2; i++) {
					
					streetAndCity.append(addressParts[i] + " ");
				}
				
				streetsAndCities.append(streetAndCity.deleteCharAt(streetAndCity.length() - 1) + ",");
			}
		}
		
		if (streetsAndCities.length() > 0 && addressesNumbers.length() > 0) {
			
			result.append(streetsAndCities.deleteCharAt(streetsAndCities.length() - 1));
			result.append(addressesNumbers.deleteCharAt(addressesNumbers.length() - 1));
		} else {
			
			result.append("/");
		}
		
		
		return result.toString();
	}

}
