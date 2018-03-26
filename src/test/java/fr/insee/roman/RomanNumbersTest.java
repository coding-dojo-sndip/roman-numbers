package fr.insee.roman;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class RomanNumbersTest {

	@Test
	public void testToRoman1() throws Exception {
		assertThat(RomanNumbers.toRoman(1)).isEqualTo("I");
	}
	
	@Test
	public void testToRoman2() throws Exception {
		assertThat(RomanNumbers.toRoman(2)).isEqualTo("II");
	}
	
	@Test
	public void testToRoman3() throws Exception {
		assertThat(RomanNumbers.toRoman(3)).isEqualTo("III");
	}
	
	@Test
	public void testToRoman4() throws Exception {
		assertThat(RomanNumbers.toRoman(4)).isEqualTo("IV");
	}
	
	@Test
	public void testToRoman5() throws Exception {
		assertThat(RomanNumbers.toRoman(5)).isEqualTo("V");
	}
	
	@Test
	public void testToRoman6() throws Exception {
		assertThat(RomanNumbers.toRoman(6)).isEqualTo("VI");
	}
	
	@Test
	public void testToRoman7() throws Exception {
		assertThat(RomanNumbers.toRoman(7)).isEqualTo("VII");
	}
	
	@Test
	public void testToRoman8() throws Exception {
		assertThat(RomanNumbers.toRoman(8)).isEqualTo("VIII");
	}
	
	@Test
	public void testToRoman9() throws Exception {
		assertThat(RomanNumbers.toRoman(9)).isEqualTo("IX");
	}
	
	@Test
	public void testToRoman10() throws Exception {
		assertThat(RomanNumbers.toRoman(10)).isEqualTo("X");
	}
	
	@Test
	public void testToRoman24() throws Exception {
		assertThat(RomanNumbers.toRoman(24)).isEqualTo("XXIV");
	}
	
	@Test
	public void testToRoman57() throws Exception {
		assertThat(RomanNumbers.toRoman(57)).isEqualTo("LVII");
	}
	
	@Test
	public void testToRoman89() throws Exception {
		assertThat(RomanNumbers.toRoman(89)).isEqualTo("LXXXIX");
	}
	
	@Test
	public void testToRoman99() throws Exception {
		assertThat(RomanNumbers.toRoman(99)).isEqualTo("XCIX");
	}
	
	@Test
	public void testToRoman100() throws Exception {
		assertThat(RomanNumbers.toRoman(100)).isEqualTo("C");
	}
	
	@Test
	public void testToRoman400() throws Exception {
		assertThat(RomanNumbers.toRoman(400)).isEqualTo("CD");
	}
	
	@Test
	public void testToRoman600() throws Exception {
		assertThat(RomanNumbers.toRoman(600)).isEqualTo("DC");
	}
	
	@Test
	public void testToRoman800() throws Exception {
		assertThat(RomanNumbers.toRoman(800)).isEqualTo("DCCC");
	}
	
	@Test
	public void testToRoman900() throws Exception {
		assertThat(RomanNumbers.toRoman(900)).isEqualTo("CM");
	}
	
	@Test
	public void testToRoman1000() throws Exception {
		assertThat(RomanNumbers.toRoman(1000)).isEqualTo("M");
	}
	
	@Test
	public void testToRoman1984() throws Exception {
		assertThat(RomanNumbers.toRoman(1984)).isEqualTo("MCMLXXXIV");
	}
}
