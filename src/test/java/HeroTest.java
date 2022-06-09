import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;
/**
  * @version (20220609)
 */
public class HeroTest {
    @Test
    public void testConstructor1()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Hero h = new Hero();
        // undo the binding in System
        System.setOut(originalOut);
        
        // assertion
        assertEquals(120, h.hp, "Hero.Hero()内でのhpの設定が不正です!");
        assertEquals("??", h.name,"Hero.Hero()内でのnameの設定が不正です!");
    }

    @Test
    public void testConstructor2()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Hero h = new Hero("生命太郎");
        // undo the binding in System
        System.setOut(originalOut);
        
        // assertion
        assertEquals(120, h.hp, "Hero.Hero(String)内でのhpの設定が不正です!");
        assertEquals("生命太郎", h.name, "Hero.Hero(String)内でのnameの設定が不正です!");
    }

    @Test
    public void testConstructor3()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Hero h = new Hero("生命太郎", 200);
        // undo the binding in System
        System.setOut(originalOut);

        // assertion
        assertEquals(200, h.hp,"Hero.Hero(String, int)内でのhpの設定が不正です!");
        assertEquals("生命太郎", h.name,"Hero.Hero(String, int)内でのnameの設定が不正です!");
    }
}
