package org.mael.katas.fizzbuzz.strategies;

public class FizzStrategy implements FizzBuzzStrategy {

	public FizzStrategy() {

	}

	@Override
	public String evaluate(int iteration) {
		return iteration % 3 == 0 ? "Fizz" : "";
	}

}
