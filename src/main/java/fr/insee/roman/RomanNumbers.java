package fr.insee.roman;

public class RomanNumbers {

	public static String toRoman(int integer) {
		if (integer >= 4_000) {
			throw new NumberTooHighException(integer);
		}
		
		int remainder = integer;
		
		int numberOfM = remainder / 1_000;
		remainder = remainder % 1_000;
		
		int numberOfC = remainder / 100;
		remainder = remainder % 100;

		int numberOfX = remainder / 10;
		remainder = remainder % 10;
		
		int numberOfI = remainder;
		
		return substituteM(numberOfM) + substituteC(numberOfC) + substituteX(numberOfX) + substituteI(numberOfI);
	}

	private static String substituteI(int numberOfI) {
		return substitute(numberOfI, "I", "V", "X");
	}

	private static String substituteX(int numberOfX) {
		return substitute(numberOfX, "X", "L", "C");
	}

	private static String substituteC(int numberOfC) {
		return substitute(numberOfC, "C", "D", "M");
	}

	private static String substituteM(int numberOfM) {
		return substitute(numberOfM, "M", null, null);
	}
	
	private static String substitute(int numberOfValue, String value, String substitution, String nextValue) {
		switch (numberOfValue) {
			case 1:
				return value;
			case 2:
				return value + value;
			case 3:
				return value + value + value;
			case 4:
				return value + substitution;
			case 5:
				return substitution;
			case 6:
				return substitution + value;
			case 7:
				return substitution + value + value;
			case 8:
				return substitution + value + value + value;
			case 9:
				return value + nextValue;
		}
		return "";
	}
}
