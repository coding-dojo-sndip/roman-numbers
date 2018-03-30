package fr.insee.roman;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class RomanToNumberTest {
	
	@Test
	public void testToRoman1() {
		assertThat(Romain.romainVersArabe("I")).isEqualTo(1);
		assertThat(Romain.romainVersArabe("XCIX")).isEqualTo(99);
		assertThat(Romain.romainVersArabe("XIX")).isEqualTo(19);
		assertThat(Romain.romainVersArabe("MMXVIII")).isEqualTo(2018);
		assertThat(Romain.romainVersArabe("XLXXXX")).isEqualTo(80);
		
	}
	
	@Test
	public void testValiderRoman() {
		assertThat(Romain.validerRomain("I")).isTrue();
		assertThat(Romain.validerRomain("IIII")).isFalse();
		assertThat(Romain.validerRomain("XLXXXX")).isFalse();

		
	}
	
}
