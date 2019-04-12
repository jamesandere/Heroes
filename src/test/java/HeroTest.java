import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
  @Test
  public void Hero_gets_name(){
    Hero hero = new Hero("Avatar", 30, "air", "women");
    assertEquals("Avatar", hero.getOtherName());
  }
}
