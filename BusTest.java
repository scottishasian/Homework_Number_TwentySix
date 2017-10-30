import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BusTest{

  Bus bus;
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

  @Test
  public void hasSeats() {
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canAddPassenger() {
    bus.addPassenger(person);
    assertEquals(1, bus.passengerCount());
  }

  // @Test
  // public void busHasNoSeats() {
  //   for(int i = 10; i > 0; i-- ){
  //     bus.getPassengers(person);
  //   }
  //   assertEquals(0, bus.seatCount);
  // }
}
