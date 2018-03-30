package fr.insee.roman;

public class Romain {

	public static ChiffreRomain plusGrandSymbole(String romain) {
		for (ChiffreRomain c : ChiffreRomain.values()) {
			if (romain.contains(c.toString())) {
				return c;
			}
		}
		return null;
	}

	public static int romainVersArabe(String romain) {

		for (ChiffreRomain c : ChiffreRomain.values()) {
			if (romain.contains(c.toString())) {
				romain = romain.replaceFirst(c.toString(), "");
				return romainVersArabe(romain) + c.getValeur();
			}
		}
		return 0;
	}

	public static boolean validerRomain(String romain) {

		return romain.matches(
				"^M{0,3}(C|CC|CCC|CD|D|DC|DCC|DCCC|CM)?(X|XX|XXX|XL|L|LX|LXX|LXXX|XC)?(I|II|III|IV|V|VI|VII|VIII|IX)?$");

	}

	public static void main(String[] args) {

	}

}
