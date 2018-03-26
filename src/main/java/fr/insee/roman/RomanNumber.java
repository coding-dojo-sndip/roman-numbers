package fr.insee.roman;

import org.assertj.core.util.Objects;

public class RomanNumber {

	private int number;
	private String romanNumber;
	
	private RomanNumber(int number, String romanNumber) {
		this.number = number;
		this.romanNumber = romanNumber;
	}
	
	public static RomanNumber of(String romanNumber) {
		return new RomanNumber(RomanNumbers.toNumber(romanNumber), romanNumber);
	}
	
	public static RomanNumber of(Integer number) {
		return new RomanNumber(number, RomanNumbers.toRoman(number));
	}
	
	public RomanNumber plus(RomanNumber other) {
		return RomanNumber.of(this.number + other.number);
	}

	public int getNumber() {
		return number;
	}

	public String getRomanNumber() {
		return romanNumber;
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object object) {
		RomanNumber other = Objects.castIfBelongsToType(object, RomanNumber.class);
		return other != null && other.number == this.number;
	}
	
	
}
