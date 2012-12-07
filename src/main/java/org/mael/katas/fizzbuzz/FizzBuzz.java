package org.mael.katas.fizzbuzz;

import java.util.List;

import org.mael.katas.fizzbuzz.decorators.FizzBuzzDecorator;
import org.mael.katas.fizzbuzz.printers.FizzBuzzPrinter;



public class FizzBuzz {
	
	private List<String> turns;

	private int iterations;

	private FizzBuzzPrinter printer;

	private FizzBuzzDecorator decorator;

	public FizzBuzz(int iterations, FizzBuzzPrinter printer,
			FizzBuzzDecorator decorator) {
		super();
		this.iterations = iterations;
		this.printer = printer;
		this.decorator = decorator;
	}

	public void start() {

	}

}
