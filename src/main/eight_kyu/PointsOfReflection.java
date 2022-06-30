package main.eight_kyu;

public class PointsOfReflection {

	public static int[] solution(int[] p, int[] q) {
		
		return new int[] { 
				q[0] - (p[0] - q[0]),
				q[1] - (p[1] - q[1])};
	}

}
