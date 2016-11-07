package at.fhj.itm.swd;

import java.util.logging.Logger;

public interface Stack {

	/**
	 * Tests if this stack is empty.
	 */
	public abstract boolean isEmpty();

	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * if Stack is full return an error message
	 * 
	 * @param item
	 */
	public abstract void push(String item);

	/**
	 * Removes the object at the top of this stack and returns that
	 * object as the value of this function.
	 * 
	 * if Stack is empty return an error message
	 */
	public abstract String pop();

}