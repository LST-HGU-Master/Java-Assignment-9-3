import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;

public class InvisibleHeroTest {
    //TODO: super()を呼び出しているかはチェックできていない
    
    @Test
    public void testConstructor1()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        InvisibleHero h = new InvisibleHero();

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
        InvisibleHero h = new InvisibleHero("生命太郎");

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
        InvisibleHero h = new InvisibleHero("生命太郎", 200);

        // assertion
        assertEquals(200, h.hp);
        assertEquals("生命太郎", h.name);

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testConstructor4()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        InvisibleHero h = new InvisibleHero("生命太郎", 300, false);

        // assertion
        assertEquals(300, h.hp);
        assertEquals("生命太郎", h.name);
        assertEquals(false, h.isVisible);

        // undo the binding in System
        System.setOut(originalOut);
    }
}
