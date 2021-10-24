package store;

import static org.junit.Assert.*;

import org.junit.Test;

public class BillUnitTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Medicines_Builder heart = new Medicines_Builder();
		double tab =  heart.Observe_Total_Bill(10,100);
		assertEquals(1000,tab);
	}

}
