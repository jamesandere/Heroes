import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {
  @Test
  public void Hero_gets_name(){
    Hero hero = new Hero("Avatar", 30, "air", "women");
    assertEquals("Avatar", hero.getOtherName());
  }

  @Test
  public void Hero_gets_age(){
    Hero hero = new Hero("Avatar", 30, "air", "women");
    assertEquals(30, hero.getOtherAge());
  }

  @Test
  public void Hero_gets_powers(){
    Hero hero = new Hero("Avatar", 30, "air", "women");
    assertEquals("air", hero.getOtherPowers());
  }

  @Test
  public void Hero_gets_weakness(){
    Hero hero = new Hero("Avatar", 30, "air", "women");
    assertEquals("women", hero.getOtherWeakness());
  }
}
