package fr.insee.roman;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void testAddition1() {
		assertThat(RomanNumber.of("I").plus(RomanNumber.of("I"))).isEqualTo(RomanNumber.of("II"));
	}
	
	@Test
	public void testAddition2() {
		assertThat(RomanNumber.of("I").plus(RomanNumber.of("II"))).isEqualTo(RomanNumber.of("III"));
	}
	
	@Test
	public void testAddition3() {
		assertThat(RomanNumber.of("I").plus(RomanNumber.of("IV"))).isEqualTo(RomanNumber.of("V"));
	}
	
	@Test
	public void testAddition4() {
		assertThat(RomanNumber.of("MCCCXXVI").plus(RomanNumber.of("DLV"))).isEqualTo(RomanNumber.of("MDCCCLXXXI"));
	}
}
