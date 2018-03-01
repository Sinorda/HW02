import static org.junit.Assert.*;
import org.junit.Test;

public class TestMain {
	
	@Test
  public void evaluatesExpression() {
  	System.out.println("Test true is true, should always pass.");
  	assertTrue(true);
  }

  @Test
  public void shouldFail() {
  	System.out.println("Test 6 == 10, should always fail.");
  	assertEquals(6, 10);
  }

}