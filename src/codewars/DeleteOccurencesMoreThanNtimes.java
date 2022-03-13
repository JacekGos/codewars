package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DeleteOccurencesMoreThanNtimes {
	
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		
//		String[] strings = new String[]{"a", "b"};
//		List<String> stringList = Arrays.asList(strings);
		
		List<Integer> elementList = Arrays.stream(elements).boxed().collect(Collectors.toList());
		
//		for (Integer element : elementList) {
//			System.out.println("occur: " + Collections.frequency(elementList, 1));
//			
//			if (Collections.frequency(elementList, 1) > maxOccurrences) {
//				
//			}
//		}
		
		for (Integer element : elementList) {
			
			
		}
		
		
		return null;
	}
	
}
