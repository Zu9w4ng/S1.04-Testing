package main.n1ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculoDni {

	public static char calculateLetter(int numDni) {

		ArrayList<Character> possibleLetters = new ArrayList<Character>(Arrays.asList('T','R','W','A'
				,'G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'));

		int mod = numDni % 23;;
		char dniLetter = possibleLetters.get(mod);
		return dniLetter;

	}
}
