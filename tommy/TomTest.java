package tommy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TomTest {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Test Started");
	}

	@Test
	void testDisp() {
		assertEquals("James Bond 007",Tom.disp());
//		fail("Not yet implemented");
	}

}
