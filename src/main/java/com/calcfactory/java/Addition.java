/**
 * 
 */
package com.calcfactory.java;

/**
 * @author Thierry
 *
 */
public class Addition {
	
	protected int value = 0;

	public Addition(int a) {
		// TODO Auto-generated constructor stub
		this.value = a;

	}
	
	public void make(int b) {
		this.value = this.value + b;
	}
	
	public int getValue() {
		return this.value;
	}
}
