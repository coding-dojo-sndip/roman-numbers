package fr.insee.roman;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RomanNumbers {

	private static final Map<String, Integer> romanToNumber = initRomans();
	
	private static Map<String, Integer> initRomans() {
		Map<String, Integer> romans = new LinkedHashMap<>();
		romans.put("M",  1000);
		romans.put("CM", 900);
		romans.put("D",  500);
		romans.put("CD", 400);
		romans.put("C",  100);
		romans.put("XC", 90);
		romans.put("L",  50);
		romans.put("XL", 40);
		romans.put("X",  10);
		romans.put("IX", 9);
		romans.put("V",  5);
		romans.put("IV", 4);
		romans.put("I",  1);
		return romans;
	}
	
	public static String toRoman(int integer) {
		if(integer <= 0 || integer >= 4000) {
			throw new InputException(integer);
		}
		String romanNumber = "";
		int remainder = integer;
		for (Entry<String, Integer> entry : romanToNumber.entrySet()) {
			Integer value = entry.getValue();
			while(remainder >= entry.getValue()) {
				remainder -= value;
				romanNumber += entry.getKey();
			}
		}
		return romanNumber;
	}
}
