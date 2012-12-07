package org.mael.katas.fizzbuzz;

import org.mael.katas.fizzbuzz.decorators.FizzBuzzDecorator;
import org.mael.katas.fizzbuzz.printers.FizzBuzzPrinter;

public class FizzBuzzBuilder {

	private int iterations;

	private FizzBuzzPrinter printer;

	private FizzBuzzDecorator decorator;

	public FizzBuzzBuilder() {

	}

	public FizzBuzzBuilder upTo(int iterations) {
		this.iterations = iterations;
		return this;
	}

	public FizzBuzzBuilder withPrinter(FizzBuzzPrinter printer) {
		this.printer = printer;
		return this;
	}

	public FizzBuzzBuilder addDecorator(FizzBuzzDecorator decorator) {
		this.decorator = decorator;
		return this;
	}

	public FizzBuzz build() {
		return new FizzBuzz(this.iterations, this.printer, this.decorator);
	}

}
