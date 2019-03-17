package Interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class simpleinterest {

	@Test
	void test() {
		CalculateInterest test = new CalculateInterest();
		double output = test.simpleinterest(1000, 2, 15);
		assertEquals(300.000000000000,output);
	}

}
