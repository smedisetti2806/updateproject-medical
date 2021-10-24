package store;

import static org.junit.Assert.*;

import org.junit.Test;

public class TabletUnitTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		For_Heart_Patients heart = new For_Heart_Patients();
		double tab =  heart.Price_Per_Tablet(100);
		assertEquals(100,tab);
	}

}
