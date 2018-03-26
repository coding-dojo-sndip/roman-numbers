package fr.insee.roman;

@SuppressWarnings("serial")
public class InputException extends RuntimeException {

	public InputException(Integer integer) {
		super(String.format("Number %d is not a valid input high, valid range is {1; 3999}", integer));
	}
}
