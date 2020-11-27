package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AccountTest {
	
	Account account;
	
	
		
	@BeforeEach 
	public void setUp() {
		account = new Account("John",25,500);
	}
	
		
	@Test
	void testAccountConstructor() {
		
		assertEquals("John", account.getName());
		assertEquals(25, account.getAge());
		assertEquals(500, account.getBalance());
	}
	
	@Test
	void testAccountChangeName() {
		
		account.setName("Joe");
		assertEquals("Joe", account.getName());
	}
	@Test
	void testAccountChangeAge() {
		
		account.setAge(30);
		assertEquals(30, account.getAge());
	}
	
	@Test
	void testAccountDepositMoney() {
		
		account.depositMoney(100);
		assertEquals(600, account.getBalance());
	}
	@Test
	void testAccountWithdrawMoneyAllow() {
		
		assertEquals("TAKE MONEY", account.withDrawMoney(100));
		assertEquals(400, account.getBalance());
	}
	@Test
	void testAccountWithdrawMoneyNotAllow() {
		
		assertEquals("FUNDS LOW", account.withDrawMoney(700));
		assertEquals(500, account.getBalance());
	}
	
	@Test
	void testCalculateBankCharges() {
		
		account.depositMoney(100);
		account.depositMoney(100);
		account.withDrawMoney(100);
		assertEquals(1.5,account.calculateBankCharges() );
		
	}
	@Test
	void testCalculateInterestDuo() {
		
		assertEquals(50,account.calculateInterestDue() );
		
	}
	
	@ParameterizedTest(name="Age{0} should have annual charge of {1}")
	@CsvSource({"67,5","66,5","65,10","64,10","20,10","19,10","18,10","17,0","16,0","1,0","0,0"})
	void testAnnualCharge(int age,double annualCharge) {
		account.setAge(age);
		assertEquals(annualCharge,account.getAnnualCharge());
	}
	
	
}
