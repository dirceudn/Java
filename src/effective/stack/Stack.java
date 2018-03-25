package effective.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

//Can you spot the "memory leak"?
public class Stack {
	
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	
	
	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}
	
	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}
	
	public Object pop(){
		if(size == 0) {
			throw new EmptyStackException();
		}
		return elements[--size];
	}
	
	public Object newPop() {
		if(size == 0) {
			throw new EmptyStackException();
		}
		Object result = elements[--size];
		elements[size] = null;
		return result;
	}

	private void ensureCapacity() {
		// TODO Auto-generated method stub
		if(elements.length == size) {
			elements = Arrays.copyOf(elements,  2*size +1);
		}
		
	}

}
