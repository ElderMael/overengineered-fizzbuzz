package org.mael.katas.fizzbuzz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.mael.katas.fizzbuzz.decorators.FizzBuzzDecorator;
import org.mael.katas.fizzbuzz.printers.FizzBuzzPrinter;
import org.mael.katas.fizzbuzz.strategies.FizzBuzzStrategy;
import org.mael.katas.fizzbuzz.strategies.StrategyChain;

public class FizzBuzz implements Iterable<String> {

	private List<String> turns;

	private int iterations;

	private FizzBuzzPrinter printer;

	private FizzBuzzDecorator decorator;

	private StrategyChain chainedStrategies;

	public FizzBuzz(int iterations, FizzBuzzPrinter printer,
			FizzBuzzDecorator decorator, List<FizzBuzzStrategy> evaluators) {
		super();
		this.iterations = iterations;
		this.printer = printer;
		this.decorator = decorator;
		this.chainedStrategies = new StrategyChain(evaluators);
	}

	public void start() {

		this.turns = new ArrayList<>(this.iterations);

		while (this.turns.size() != this.iterations) {

			String turn = this.chainedStrategies
					.evaluate(this.turns.size() + 1);

			turn = this.decorator.addStuff(turn);

			this.turns.add(turn);

		}

	}

	public List<String> getTurns() {
		return turns;
	}

	public void setTurns(List<String> turns) {
		this.turns = turns;
	}

	public int getIterations() {
		return iterations;
	}

	public void setIterations(int iterations) {
		this.iterations = iterations;
	}

	public FizzBuzzPrinter getPrinter() {
		return printer;
	}

	public void setPrinter(FizzBuzzPrinter printer) {
		this.printer = printer;
	}

	public FizzBuzzDecorator getDecorator() {
		return decorator;
	}

	public void setDecorator(FizzBuzzDecorator decorator) {
		this.decorator = decorator;
	}

	public StrategyChain getChainedStrategies() {
		return chainedStrategies;
	}

	public void setChainedStrategies(StrategyChain chainedStrategies) {
		this.chainedStrategies = chainedStrategies;
	}

	public void print() {

		for (String turn : this) {
			this.printer.print(turn);
		}

	}

	@Override
	public Iterator<String> iterator() {

		return this.turns.iterator();
	}

}
