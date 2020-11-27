package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalesPersonTest {
	SalesPerson salesPerson;
	
	@BeforeEach 
	public void setUp() {
		salesPerson = new SalesPerson("John", 4,5,5,5);
	}
	 	
	@Test
	void testPersonSalesConstructed() {
		assertEquals("John", salesPerson.getName());
		assertEquals(4, salesPerson.getYearsOfService());
	}
	
	@Test
	void testNameChanged() {
		salesPerson.setName("Tom");
		assertEquals("Tom", salesPerson.getName());
		
	}
	

	@Test
	void testTotalSales() {
		assertEquals(500, salesPerson.getTotalSales());
		
	}
	
	@Test
	void testComissionSalesLessOrEqual1000() {
		assertEquals(50, salesPerson.getComissionOnSales());
		
	}
	@Test
	void testComissionSalesMoreThan1000() {
		SalesPerson salesPerson1 = new SalesPerson("John", 4, 20, 20, 20);
		assertEquals(250, salesPerson1.getComissionOnSales());
		
	}
	
	@Test
	void testShouldBeDismissesLocksTrue() {
		SalesPerson salesPerson1 = new SalesPerson("John", 4, 0, 5, 5);
		assertTrue(salesPerson1.shouldbeDismissed());
		
	}
	@Test
	void testShouldBeDismissesStocksTrue() {
		SalesPerson salesPerson1 = new SalesPerson("John", 4, 5, 0, 5);
		assertTrue(salesPerson1.shouldbeDismissed());
		
	}
	@Test
	void testShouldBeDismissesBarrelsTrue() {
		SalesPerson salesPerson1 = new SalesPerson("John", 4, 5, 5, 0);
		assertTrue(salesPerson1.shouldbeDismissed());
		
	}
	@Test
	void testShouldBeDismissedFalse() {
		SalesPerson salesPerson1 = new SalesPerson("John", 4, 1, 4, 1);
		assertFalse(salesPerson1.shouldbeDismissed());
		
	}
	@Test
	void testEligibleForBonusTrue() {
		SalesPerson salesPerson1 = new SalesPerson("John", 4, 51, 1, 1);
		assertTrue(salesPerson1.shouldGetBonus());
		
	}
	@Test
	void testEligibleForBonusFalseMoreThan5Years() {
		SalesPerson salesPerson1 = new SalesPerson("John", 6, 6, 100, 1);
		assertFalse(salesPerson1.shouldGetBonus());
		
	}
	@Test
	void testEligibleForBonusFalseLessThan50Stocks() {
		SalesPerson salesPerson1 = new SalesPerson("John", 2, 2, 40, 1);
		assertFalse(salesPerson1.shouldGetBonus());
		
	}
	
	
	
	
	
	
	
	

}
