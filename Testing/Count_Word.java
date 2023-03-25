package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class Count_Word {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int output=test.count("Amazon");
		assertEquals(2,output);
		
	}

}