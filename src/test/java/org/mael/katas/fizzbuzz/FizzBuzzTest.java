package org.mael.katas.fizzbuzz;

import org.junit.Test;
import org.mael.katas.fizzbuzz.decorators.HiccupDecorator;
import org.mael.katas.fizzbuzz.printers.FizzBuzzConsolePrinter;

public class FizzBuzzTest {

	@Test
	public void fizzBuzzTest() {

		FizzBuzz FizzBuzz = FizzBuzzGame.start().upTo(100)
				.withPrinter(new FizzBuzzConsolePrinter())
				.addDecorator(new HiccupDecorator()).build();

	}
}
