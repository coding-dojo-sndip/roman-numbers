package fr.insee.roman;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class NumberToRomanTest {
	
	@Test
	public void testToRoman1() {
		assertThat(RomanNumbers.toNumber("I")).isEqualTo(1);
	}
	
	@Test
	public void testToRoman2() {
		assertThat(RomanNumbers.toNumber("II")).isEqualTo(2);
	}
	
	@Test
	public void testToRoman3() {
		assertThat(RomanNumbers.toNumber("III")).isEqualTo(3);
	}
	
	@Test
	public void testToRoman4() {
		assertThat(RomanNumbers.toNumber("IV")).isEqualTo(4);
	}
	
	@Test
	public void testToRoman5() {
		assertThat(RomanNumbers.toNumber("V")).isEqualTo(5);
	}
	
	@Test
	public void testToRoman6() {
		assertThat(RomanNumbers.toNumber("VI")).isEqualTo(6);
	}
	
	@Test
	public void testToRoman7() {
		assertThat(RomanNumbers.toNumber("VII")).isEqualTo(7);
	}
	
	@Test
	public void testToRoman8() {
		assertThat(RomanNumbers.toNumber("VIII")).isEqualTo(8);
	}
	
	@Test
	public void testToRoman9() {
		assertThat(RomanNumbers.toNumber("IX")).isEqualTo(9);
	}
	
	@Test
	public void testToRoman10() {
		assertThat(RomanNumbers.toNumber("X")).isEqualTo(10);
	}
	
	@Test
	public void testToRoman24() {
		assertThat(RomanNumbers.toNumber("XXIV")).isEqualTo(24);
	}
	
	@Test
	public void testToRoman57() {
		assertThat(RomanNumbers.toNumber("LVII")).isEqualTo(57);
	}
	
	@Test
	public void testToRoman89() {
		assertThat(RomanNumbers.toNumber("LXXXIX")).isEqualTo(89);
	}
	
	@Test
	public void testToRoman99() {
		assertThat(RomanNumbers.toNumber("XCIX")).isEqualTo(99);
	}
	
	@Test
	public void testToRoman100() {
		assertThat(RomanNumbers.toNumber("C")).isEqualTo(100);
	}
	
	@Test
	public void testToRoman400() {
		assertThat(RomanNumbers.toNumber("CD")).isEqualTo(400);
	}
	
	@Test
	public void testToRoman600() {
		assertThat(RomanNumbers.toNumber("DC")).isEqualTo(600);
	}
	
	@Test
	public void testToRoman800() {
		assertThat(RomanNumbers.toNumber("DCCC")).isEqualTo(800);
	}
	
	@Test
	public void testToRoman900() {
		assertThat(RomanNumbers.toNumber("CM")).isEqualTo(900);
	}
	
	@Test
	public void testToRoman1000() {
		assertThat(RomanNumbers.toNumber("M")).isEqualTo(1000);
	}
	
	@Test
	public void testToRoman1984() {
		assertThat(RomanNumbers.toNumber("MCMLXXXIV")).isEqualTo(1984);
	}
}
