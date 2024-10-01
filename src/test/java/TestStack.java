import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {
	MyStack <String> T;
	
	@BeforeEach
	void setUp() throws Exception {
		T = new MyStack<> ();
		
	}
	
	//Push() should out the e to the top of the stack
	@Test
	void testPush() {
		T.push("A");
		assertEquals("A", T.top()); // return A, top can help us know the top value
		
		T.push("B");
		assertEquals("B", T.top()); //should return B
		
	}
	
	//top should return the top e
	@Test
	void testTop() {
		//assertTrue(T.isEmpty()); //at the first, it should be null
		assertThrows(StackUnderFlowException.class, () -> T.top());
		
		T.push("A"); //still use push here
		assertEquals("A", T.top());
		
		T.push("B"); //check more case
		assertEquals("B", T.top());
		
		
		
	}
	
	//pop remove and return the top
	@Test
	void testPop() {
		//assertTrue(T.isEmpty());
		assertThrows(StackUnderFlowException.class, () -> T.pop());
		
		T.push("A");
		T.push("B");//we need at least two e to test this case
		
		assertEquals("B", T.pop()); //should pop B
		assertEquals("A", T.pop()); //then A
		assertTrue(T.isEmpty()); //in the end the stack should be null, if not true, then fail
	}
	
	//isEmpty
	void testIsEmpty() {
		assertTrue(T.isEmpty()); //at the first, it should be null
		
		T.push("A");
		assertFalse(T.isEmpty()); //cuz we put sth in, so it should not be null 
	}

}
