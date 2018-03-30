package fr.insee.roman;

public enum ChiffreRomain {
	IV(4), IX(9), XL(40), XC(90), CD(400), CM(900),M(1000),D(500),C(100),L(50),X(10),V(5),I(1);
	private int valeur;

	private ChiffreRomain(int valeur) {
		this.valeur = valeur;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	
}
