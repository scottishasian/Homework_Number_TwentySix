import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BusTest{

  Bus bus;
  Passengers passengers;
  Person person;

  @Before
  public void before() {
    this.bus = new Bus("Megabus", 10);
    this.person = new Person();
  }

  @Test
  public void hasName() {
    String name = bus.getName();
    assertEquals("Megabus", name);
  }


}
