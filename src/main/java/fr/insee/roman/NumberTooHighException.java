package fr.insee.roman;

@SuppressWarnings("serial")
public class NumberTooHighException extends RuntimeException {

	public NumberTooHighException(Integer integer) {
		super(String.format("Number %d is too high, maximum is 999", integer));
	}
}
