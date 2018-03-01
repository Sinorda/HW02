import static org.junit.Assert.*;
import org.junit.Test;

public class TestMain {
	
	@Test
	@DisplayName("Test true is true, should always pass.")
  public void evaluatesExpression() {
  	assertTrue(true);
  }

  @Test
  @DisplayName("Test 6 == 10, should always fail.")
  public void shouldFail() {
  	assertEquals(6, 10);
  }

}