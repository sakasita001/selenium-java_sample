package seleniumSample;

import org.junit.jupiter.api.Test;

public class TestCase {
	@Test
	public void doTest() throws InterruptedException {
		SearchGoogle test1 = new SearchGoogle();

		test1.searchGoogle();
	}
}
