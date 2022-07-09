package main.six_kyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrizeDraw {

	public static String nthRank(String st, Integer[] we, int n) {
		
		if (st.isEmpty()) {
			return "No participants";
		} 
		
		String[] names = st.split(",");

		
		if (n > names.length) {
			return "Not enough participants";
		}

		class ResultObject implements Comparable<ResultObject>{

			private Integer som;
			private String name;

			ResultObject(int som, String name) {
				this.som = som;
				this.name = name;
			}
			
			Integer getSom() {
				return this.som;
			}
			
			String getName() {
				return this.name;
			}
			
			public int compareTo(ResultObject ro) {
				
				if (getSom().intValue() == ro.getSom().intValue()) {
					
					int stringCmpResult = getName().compareTo(ro.getName());
					
					if (stringCmpResult > 0) {
						return -1;
					} else if (stringCmpResult < 0) {
						return 1;
					} else {
						return 0;
					}
				}
				
				return getSom().compareTo(ro.getSom());
			}
			
			public String toString() {
				return this.som + " " + this.name;
			}
		}

		List<ResultObject> results = new ArrayList<ResultObject>();

		for (int i = 0; i < names.length; i++) {

			int som = 0;
			String name = names[i];

			for (char nameCh : name.toCharArray()) {

				int rankVal = Character.toLowerCase(nameCh);
//				if (rankVal >= 97) {
//					rankVal -= 96;
//				} else {
//					rankVal -= 64;
//				}
				rankVal -= 96;

				som += rankVal;

			}

			som += name.length();
			som *= we[i];

			results.add(new ResultObject(som, name));

		}
		
		Collections.sort(results);
		Collections.reverse(results);
		
		return results.get(n - 1).getName();
	}

}
