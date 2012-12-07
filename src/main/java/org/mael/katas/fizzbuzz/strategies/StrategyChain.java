package org.mael.katas.fizzbuzz.strategies;

import java.util.Iterator;
import java.util.List;

public class StrategyChain {

	private List<FizzBuzzStrategy> strategies;

	public StrategyChain(List<FizzBuzzStrategy> evaluators) {
		this.strategies = evaluators;
	}

	public String evaluate(int iteration) {

		StringBuilder turn = new StringBuilder("");

		Iterator<FizzBuzzStrategy> chain = this.strategies.iterator();

		while (chain.hasNext()) {
			String evaluated = chain.next().evaluate(iteration);
			turn.append(evaluated);
		}

		return turn.toString().isEmpty() ? String.valueOf(iteration) : turn
				.toString();
	}

	public List<FizzBuzzStrategy> getStrategies() {
		return strategies;
	}

	public void setStrategies(List<FizzBuzzStrategy> strategies) {
		this.strategies = strategies;
	}

}
