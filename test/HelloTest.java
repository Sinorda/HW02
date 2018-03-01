import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloTest {

	@Test
  public void shouldFail() {
  	assertEquals(6, 1);
  }
	
	@Test
  public void shouldPass() {
  	assertEquals(6, 6);
  }

}