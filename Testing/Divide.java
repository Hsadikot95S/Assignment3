package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Divide {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		double Divide=test.divide(6, 2);
		assertEquals(3.0,Divide);
		
		
	}

}
