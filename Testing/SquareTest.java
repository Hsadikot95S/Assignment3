package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int negative=test.square(-5);
		assertEquals(25,negative);
		int positive=test.square(5);
		assertEquals(25,positive);
	}
}
