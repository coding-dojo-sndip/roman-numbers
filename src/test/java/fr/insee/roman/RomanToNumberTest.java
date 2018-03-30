package fr.insee.roman;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class RomanToNumberTest {
	
	@Test
	public void testToRoman1() {
		assertThat(1).isEqualTo("I");
	}
	
}
