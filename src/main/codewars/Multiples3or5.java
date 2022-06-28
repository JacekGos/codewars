package main.codewars;

import java.util.Scanner;

public class Multiples3or5 {

	public static int solution(int number) {

//		Scanner input = new Scanner(System.in);
//		int number = input.nextInt();
		
		int result = 0;

		if (number > 0) {
			for (int i = 0; i < number; i++) {
					
					if (i % 3 == 0 || i % 5 == 0) {
						
					result += i;
				}
			}
		}
		
		return result;
	}
}
