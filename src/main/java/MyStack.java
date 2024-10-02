
public class MyStack<T>
{
	private class Node {
		T value;
		Node next;
		
		Node(T value, Node next){ //constructor
			this.value =value;
			this.next = next;
		}
	}

	private Node topNode;
	
	public MyStack()
	{
		topNode = null;

	}

	/**
	 * Pushes an element to the stack
	 * @param val
	 */
	public void push(T val)
	{
		topNode = new Node(val, topNode);

	}

	/**
	 * Throws stack underflow exception if empty
	 * @return the top element on the stack
	 */
	public T top()
	{
		if (isEmpty()) { //if it is empty,then throws the exception 
			throw new StackUnderFlowException();
		}

		return topNode.value;
	}

	/**
	 * Pops the top element of the stack and returns it.
	 * Throws stack underflow exception if empty
	 * @return the popped element from the stack
	 */
	public T pop()
	{
		if (isEmpty()) {//if it is empty,then throws the exception 
			throw new StackUnderFlowException();
		}
		T value = topNode.value;
		topNode = topNode.next;
		
		return value;
	}

	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty()
	{
		return topNode == null;
	}

}