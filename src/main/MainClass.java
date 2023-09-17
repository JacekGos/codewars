package main;

import main.fifth_kyu.DragonsCurve;

import java.util.*;
import java.util.stream.IntStream;

public class MainClass {

	public static void main(String[] args) {

//		DragonsCurve dc = new DragonsCurve();
//
//		final List<Integer> ins = Arrays.asList((int)'a', (int)'b', (int)'F', (int)'R', (int)'L');
//
//		System.out.println(Character.valueOf((char) (int) 'F').toString());
//
//		ins.forEach(item -> System.out.println(dc.mapFunction.apply(item)));


		final List<Integer> ns = Arrays.asList(0, 1, 2, 3, 5);
		final List<String> curves = Arrays.asList("F", "FRFR", "FRFRRLFLFR", "FRFRRLFLFRRLFRFRLLFLFR",
				"FRFRRLFLFRRLFRFRLLFLFRRLFRFRRLFLFRLLFRFRLLFLFRRLFRFRRLFLFRRLFRFRLLFLFRLLFRFRRLFLFRLLFRFRLLFLFR"
		);
		Map<Integer, String> tests = new HashMap<>();

		IntStream.range(0, ns.size()).forEach(i -> tests.put(i, curves.get(i)));

//		Iterator<String> iter = tests.values().iterator();
		System.out.println(tests.size());
		tests.forEach((key, value)
				-> System.out.println(String.format("key: %d, value: %s", key, value)));
	}
}
