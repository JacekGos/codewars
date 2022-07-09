package main;

import java.util.Arrays;

import main.seven_kyu.Accumul;
import main.seven_kyu.CharacterCounter;
import main.seven_kyu.DigitsExplosion;
import main.seven_kyu.RegexValidatePinCode;
import main.seven_kyu.StrongNumber;
import main.six_kyu.ConsecutivePowers;
import main.six_kyu.LineSafari;
import main.six_kyu.MexicanWave;
import main.six_kyu.PrizeDraw;
import main.six_kyu.SalesmanTravel;
import main.six_kyu.StopSpinningMyWords;
import main.six_kyu.TwoSum;

public class MainClass {

	public static void main(String[] args) {

		String st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
		Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};

		System.out.println(PrizeDraw.nthRank(st, we, 3));
	}
}
