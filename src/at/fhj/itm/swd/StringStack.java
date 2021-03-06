package at.fhj.itm.swd;

import java.util.logging.Logger;

/**
 * Stack Implementation of <code>Stack</code> Interface. supports Strings and
 * must be initialized with max. number of of items.
 * 
 * @see Stack
 */
public class StringStack implements Stack {
	final static Logger logger = Logger.getLogger(StringStack.class.getName());
	/**
	 * stores the string values of this stack
	 */
	public String[] elementData;

	/**
	 * is the position counter of the top item
	 */
	private int elementIndex;

	/**
	 * Constructor that initializes the stack with the given size.
	 *
	 * @param capacity
	 *            the size of the initialized stack. If the size is lower than
	 *            0, the Constructor will throw an exception
	 */
	public StringStack(int capacity) {
		logger.info("Capacity: " + capacity);
		if (capacity <= 0)
			throw new IllegalArgumentException("size must be <= 0");

		elementData = new String[capacity];
		elementIndex = 0;
	}

	@Override
	public boolean isEmpty() {
		if (elementIndex==0) return true;
		else return false;
	}

	@Override
	public void push(String item) {
		logger.info("Item: " + item);
		if (elementIndex == elementData.length)
			throw new ArrayIndexOutOfBoundsException("elementIndex == elementData.length!");

		// add element to array and increment the counter
		elementData[elementIndex++] = item;
	}

	@Override
	public String pop() {
		if (elementIndex == 0)
			throw new ArrayIndexOutOfBoundsException("ElementIndex is 0");

		return elementData[--elementIndex];
	}
}
