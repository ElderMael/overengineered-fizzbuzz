package org.mael.katas.fizzbuzz.strategies;

public class BuzzStrategy implements FizzBuzzStrategy {

	@Override
	public String evaluate(int iteration) {
		return iteration % 5 == 0 ? "Buzz" : "";
	}

}
