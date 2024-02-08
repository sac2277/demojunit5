import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalTest {
	
	private Cal c=new Cal();
	@BeforeAll
	public static void setUpBeforeClass() {
		System.out.println("before class....");
	}
	@BeforeEach
	public void SetUp() {
		System.out.println("Before Test.....");
	}
	
	@Test
	void testsum() {
		int expRes=10;
		int acRes=c.doSum(3, 3, 4);
		Assert.assertEquals(acRes, expRes);
		
	}
	
	@Test
	void testMul() {
		int expRes=15;
		int acRes=c.doMul(3,5);
		Assert.assertEquals(acRes, expRes);
		
	}
	@AfterAll
	public static void tearDownAfterClass() {
		System.out.println("After class....");
	}
	@AfterEach
	public void tearDown() {
		System.out.println("after Test.....");
	}
	

}
