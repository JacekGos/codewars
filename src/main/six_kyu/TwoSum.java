package main.six_kyu;

public class TwoSum {
	
	public static int[] twoSum(int[] numbers, int target) {
		
		int index0;
		int index1;
		
		for (int i = 0; i < numbers.length; i++) {
			
			index0 = i;
			
			for (int j = i + 1; j <numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					index1 = j;
					return new int[] {index0, index1};
				}
			}
		}
		return new int[0];
	}

}
