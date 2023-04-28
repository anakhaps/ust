package mutipletest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathematicsTest1 {

	mathematics aut;
	@BeforeEach
	void setUp() throws Exception {
		aut=new mathematics();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {

		aut.setNo1(2);
		aut.setNo2(3);
		assertEquals(5,aut.add());
	}

	@Test
	void testSubtract() 
	{
		aut.setNo1(2);
		aut.setNo1(3);
		assertEquals(-1,aut.subtract());
		
		
	}

	@Test
	void testProduct() 
	{
		
		aut.setNo1(2);
		aut.setNo1(3);
		assertEquals(6,aut.product());
	}

}
