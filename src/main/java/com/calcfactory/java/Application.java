/**
 * 
 */
package com.calcfactory.java;

/**
 * @author Thierry
 *
 */
public class Application {

	/**
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
