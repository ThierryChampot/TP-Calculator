package com.calcfactory.java;

/**
 * Addition logic and methods goe here.
 * @author Thierry
 *
 */
public class Addition {

    /**
    * value is initialised at 0.
    */
    protected int value = 0;
/**
 * Takes the first number of the addition.
 * @param a The first number.
 */
    public Addition(final int a) {
        this.value = a;

    }
/**
 * Takes the second number of the addition.
 * @param b The second number.
 */
    public final void make(final int b) {
        this.value = this.value + b;
    }
/**
 * Return the value of the result.
 * @return The result of the addition.
 */
    public final int getValue() {
        return this.value;
    }
}
