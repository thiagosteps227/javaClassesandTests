import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BiscuitTest {
	Biscuit biscuit = new Biscuit("biscuit","biscuitmaker",20);
	
	@Test
	void testConstructorBiscuits() {
		Biscuit biscuit = new Biscuit();
		
		assertEquals(0, biscuit.getNumberOfBiscuits());
		assertEquals(0, biscuit.getWeight());
		assertEquals(null,biscuit.getBrand());
		assertEquals(null, biscuit.getMaker());
	}
	
	@Test
	void testConstructorBiscuitsOverload() {
		
		
		
		assertEquals(20, biscuit.getWeight());
		assertEquals("biscuit",biscuit.getBrand());
		assertEquals("biscuitmaker", biscuit.getMaker());
	}

	@Test
	void testSetWeight() {
		biscuit.setWeight(10);
		
		assertEquals(10, biscuit.getWeight());
		
	}
	
	@Test
	void testToString() {
		biscuit.toString();
		
		assertEquals("biscuit biscuitmaker 20 0",biscuit.toString());
		
	}
	
	

}
