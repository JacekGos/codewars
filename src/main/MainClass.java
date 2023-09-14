package main;

import main.fifth_kyu.DragonsCurve;

import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		DragonsCurve dc = new DragonsCurve();

		final List<Integer> ins = Arrays.asList((int)'a', (int)'b', (int)'F', (int)'R', (int)'L');

		System.out.println(Character.valueOf((char) (int) 'F').toString());

		ins.forEach(item -> System.out.println(dc.mapFunction.apply(item)));
	}


}
