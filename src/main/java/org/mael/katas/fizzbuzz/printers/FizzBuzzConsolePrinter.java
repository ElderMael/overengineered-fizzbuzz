package org.mael.katas.fizzbuzz.printers;

import org.mael.katas.fizzbuzz.FizzBuzz;

public class FizzBuzzConsolePrinter implements FizzBuzzPrinter {

	public FizzBuzzConsolePrinter() {

	}

	@Override
	public void print(String turn) {
		System.out.println(turn);
	}

}
