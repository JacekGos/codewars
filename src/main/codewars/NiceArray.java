package main.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NiceArray {
	
	public static boolean solution(Integer[] arr){
		
		List<Boolean> results = new ArrayList<Boolean>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j && (arr[j] + 1 == arr[i] || arr[j] - 1 == arr[i])) {
					results.add(true);
					break;
				}
			}
		}
        
		return results.size() == arr.length && arr.length > 1;
		
		//Better solution
//		return Arrays.
//				stream(arr).
//				filter(number -> (Arrays.asList(arr).contains(number + 1) || Arrays.asList(arr).contains(number - 1))).
//				count() == arr.length && arr.length > 1;
		
    }
}
