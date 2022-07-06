package main;

import java.util.Arrays;

import main.seven_kyu.Accumul;
import main.seven_kyu.CharacterCounter;
import main.seven_kyu.DigitsExplosion;
import main.seven_kyu.RegexValidatePinCode;
import main.seven_kyu.StrongNumber;
import main.six_kyu.ConsecutivePowers;
import main.six_kyu.ImageHost;
import main.six_kyu.LineSafari;
import main.six_kyu.MexicanWave;
import main.six_kyu.PhotoManager;
import main.six_kyu.SalesmanTravel;
import main.six_kyu.StopSpinningMyWords;
import main.six_kyu.TwoSum;

public class MainClass {

	public static void main(String[] args) {
		
		PhotoManager photoManager = new PhotoManager();
		
		System.out.println(ImageHost.generateName(photoManager));
	}
}

