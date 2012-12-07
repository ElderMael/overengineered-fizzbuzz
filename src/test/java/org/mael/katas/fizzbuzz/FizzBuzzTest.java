package org.mael.katas.fizzbuzz;

import org.junit.Test;

import org.mael.katas.fizzbuzz.decorators.HiccupDecorator;
import org.mael.katas.fizzbuzz.printers.FizzBuzzConsolePrinter;
import org.mael.katas.fizzbuzz.strategies.BuzzStrategy;
import org.mael.katas.fizzbuzz.strategies.FizzStrategy;

public class FizzBuzzTest {

	@Test
	public void fizzBuzzTest() {

		FizzBuzz fizzBuzz = FizzBuzzGame.start().upTo(100)
				.withPrinter(new FizzBuzzConsolePrinter())
				.addDecorator(new HiccupDecorator())
				.addIterationEvaluators(new FizzStrategy(), new BuzzStrategy())
				.build();

		fizzBuzz.start();
		fizzBuzz.print();

	}
}
