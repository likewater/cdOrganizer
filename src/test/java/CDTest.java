import org.junit.*;
import static org.juit.Assert.*;

public class CDTest {

  @Test
  public void Cd_createsObjectCorrectly_true() {
    Cd newCd = new Cd("Dark Side of The Moon");
    assertEquals(true, newCd instanceof Cd);
  } // to pass this test we need to create a CD class, and the Cd method which creates an instance of the CD object.

}
