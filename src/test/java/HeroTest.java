import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;

public class HeroTest {
    @Test
    public void testConstructor1()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Hero h = new Hero();

        // assertion
        assertEquals(120, h.hp);
        assertEquals("??", h.name);

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testConstructor2()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Hero h = new Hero("生命太郎");

        // assertion
        assertEquals(120, h.hp);
        assertEquals("生命太郎", h.name);

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testConstructor3()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Hero h = new Hero("生命太郎", 200);

        // assertion
        assertEquals(200, h.hp);
        assertEquals("生命太郎", h.name);

        // undo the binding in System
        System.setOut(originalOut);
    }
}
