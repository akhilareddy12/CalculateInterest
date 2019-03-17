package Interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class compoundinterest {

	@Test
	void test() {
		CalculateInterest test = new CalculateInterest();
		double output = test.compoundinterest(1000, 2, 15);
		assertEquals(322.4999999999998,output);
	}

}
