package com.calcfactory.java;

/**
 * Addition logic and methods goes here.
 * @author Thierry
 *
 */
public class Addition {

	protected int value = 0;
/**
 * Takes the first number of the addition.
 * @param a
 */
	public Addition(final int a) {
		this.value = a;

	}
/**
 * Takes the second number of the addition.
 * @param b
 */
	public void make(final int b) {
		this.value = this.value + b;
	}
/**
 *	Return the value of the result.
 * @return
 */
	public final int getValue() {
		return this.value;
	}
}
