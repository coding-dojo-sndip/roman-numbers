package fr.insee.roman;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class RomanToNumberTest {

	@Test
	public void testToRomanTooHight() {
		assertThatExceptionOfType(InputException.class)
			.isThrownBy(() -> RomanNumbers.toRoman(4000));
	}
	
	@Test
	public void testToRoman1() {
		assertThat(RomanNumbers.toRoman(1)).isEqualTo("I");
	}
	
	@Test
	public void testToRoman2() {
		assertThat(RomanNumbers.toRoman(2)).isEqualTo("II");
	}
	
	@Test
	public void testToRoman3() {
		assertThat(RomanNumbers.toRoman(3)).isEqualTo("III");
	}
	
	@Test
	public void testToRoman4() {
		assertThat(RomanNumbers.toRoman(4)).isEqualTo("IV");
	}
	
	@Test
	public void testToRoman5() {
		assertThat(RomanNumbers.toRoman(5)).isEqualTo("V");
	}
	
	@Test
	public void testToRoman6() {
		assertThat(RomanNumbers.toRoman(6)).isEqualTo("VI");
	}
	
	@Test
	public void testToRoman7() {
		assertThat(RomanNumbers.toRoman(7)).isEqualTo("VII");
	}
	
	@Test
	public void testToRoman8() {
		assertThat(RomanNumbers.toRoman(8)).isEqualTo("VIII");
	}
	
	@Test
	public void testToRoman9() {
		assertThat(RomanNumbers.toRoman(9)).isEqualTo("IX");
	}
	
	@Test
	public void testToRoman10() {
		assertThat(RomanNumbers.toRoman(10)).isEqualTo("X");
	}
	
	@Test
	public void testToRoman24() {
		assertThat(RomanNumbers.toRoman(24)).isEqualTo("XXIV");
	}
	
	@Test
	public void testToRoman57() {
		assertThat(RomanNumbers.toRoman(57)).isEqualTo("LVII");
	}
	
	@Test
	public void testToRoman89() {
		assertThat(RomanNumbers.toRoman(89)).isEqualTo("LXXXIX");
	}
	
	@Test
	public void testToRoman99() {
		assertThat(RomanNumbers.toRoman(99)).isEqualTo("XCIX");
	}
	
	@Test
	public void testToRoman100() {
		assertThat(RomanNumbers.toRoman(100)).isEqualTo("C");
	}
	
	@Test
	public void testToRoman400() {
		assertThat(RomanNumbers.toRoman(400)).isEqualTo("CD");
	}
	
	@Test
	public void testToRoman600() {
		assertThat(RomanNumbers.toRoman(600)).isEqualTo("DC");
	}
	
	@Test
	public void testToRoman800() {
		assertThat(RomanNumbers.toRoman(800)).isEqualTo("DCCC");
	}
	
	@Test
	public void testToRoman900() {
		assertThat(RomanNumbers.toRoman(900)).isEqualTo("CM");
	}
	
	@Test
	public void testToRoman1000() {
		assertThat(RomanNumbers.toRoman(1000)).isEqualTo("M");
	}
	
	@Test
	public void testToRoman1984() {
		assertThat(RomanNumbers.toRoman(1984)).isEqualTo("MCMLXXXIV");
	}
}
