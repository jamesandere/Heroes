import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {
  @Test
  public void Squad_gets_name(){
    Squad squad = new Squad("GangGang", 5, "Short people matter");
    assertEquals("GangGang", squad.getSquadName());
  }

  @Test
  public void Squad_gets_size(){
    Squad squad = new Squad("GangGang", 5, "Short people matter");
    assertEquals(5, squad.getSquadSize());
  }

  @Test
  public void Squad_gets_mission(){
    Squad squad = new Squad("GangGang", 5, "Short people matter");
    assertEquals("Short people matter", squad.getSquadMission());
  }
}
