package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	static Account testAcc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testAcc = new Account(1122, 20000);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		testAcc = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAccount() throws InsufficientFundsException {
		testAcc.setAnnualInterestRate(.045);
		testAcc.withdraw(2500);
		testAcc.deposit(3000);
		System.out.println("Your balance is: " + testAcc.getBalance()
		+ "\nYour monthly interest rate is: " + testAcc.getMonthlyInterestRate()
		+ "\nYour account's creation date is: " + testAcc.getDateCreated());
	}
	
	@Test (expected = InsufficientFundsException.class)
	public final void testException() throws InsufficientFundsException {
		testAcc.withdraw(200000.0);
	}
	
}
