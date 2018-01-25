/**
 *
 */
package com.calcfactory.java;

/**
 * The main application entry and logic.
 * @author Thierry
 *
 */
public final class Application {

	private Application () {}

	/**
	 * Short demo of what Calculator makes.
	 * @param args
	 */
	public static void main(String[] args) {
		Addition add = new Addition(1);

		add.make(2);
		System.out.println(add.getValue());

		add.make(3);
		System.out.println(add.getValue());

		// TODO Auto-generated method stub
		System.out.println("Hello World !!!");
	}
}
