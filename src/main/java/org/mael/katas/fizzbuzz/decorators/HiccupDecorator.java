package org.mael.katas.fizzbuzz.decorators;

public class HiccupDecorator implements FizzBuzzDecorator {

	@Override
	public String addStuff(String turn) {

		return Math.random() > Math.random() ? turn : (turn + "...hic!");

	}
}
