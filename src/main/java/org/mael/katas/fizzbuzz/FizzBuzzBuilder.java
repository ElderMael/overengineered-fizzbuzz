package org.mael.katas.fizzbuzz;

import java.util.LinkedList;
import java.util.List;

import org.mael.katas.fizzbuzz.decorators.FizzBuzzDecorator;
import org.mael.katas.fizzbuzz.printers.FizzBuzzPrinter;
import org.mael.katas.fizzbuzz.strategies.BuzzStrategy;
import org.mael.katas.fizzbuzz.strategies.FizzBuzzStrategy;
import org.mael.katas.fizzbuzz.strategies.FizzStrategy;
import org.mael.katas.fizzbuzz.strategies.StrategyChain;

public class FizzBuzzBuilder {

	private int iterations;

	private FizzBuzzPrinter printer;

	private FizzBuzzDecorator decorator;

	private List<FizzBuzzStrategy> chainedStrategies = new LinkedList<>();

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

	public FizzBuzzBuilder addIterationEvaluators(
			FizzBuzzStrategy... strategies) {

		for (FizzBuzzStrategy chainLink : strategies) {
			this.chainedStrategies.add(chainLink);
		}

		return this;
	}

	public FizzBuzz build() {
		return new FizzBuzz(this.iterations, this.printer, this.decorator,
				this.chainedStrategies);
	}

}
