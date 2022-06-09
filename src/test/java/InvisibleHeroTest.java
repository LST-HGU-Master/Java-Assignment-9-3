import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;
/**
  * @version (20220609)
 */
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
        
        // undo the binding in System
        System.setOut(originalOut);
        
        // assertion
        assertEquals(120, h.hp);
        assertEquals("??", h.name);
        assertEquals(120, h.hp, "InvisibleHero.InvisibleHero()内でのhpの設定が不正です!");
        assertEquals("??", h.name,"InvisibleHero.InvisibleHero()内でのnameの設定が不正です!");
    }

    @Test
    public void testConstructor2()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        InvisibleHero h = new InvisibleHero("生命太郎");

        // undo the binding in System
        System.setOut(originalOut);

        // assertion
        assertEquals(120, h.hp, "InvisibleHero.InvisibleHero(Strign)内でのhpの設定が不正です!");
        assertEquals("生命太郎", h.name,"InvisibleHero.InvisibleHero(String)内でのnameの設定が不正です!");
    }

    @Test
    public void testConstructor3()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        InvisibleHero h = new InvisibleHero("生命太郎", 200);

        // undo the binding in System
        System.setOut(originalOut);

        // assertion
        assertEquals(200, h.hp,"InvisibleHero.InvisibleHero(String, int)内でのhpの設定が不正です!");
        assertEquals("生命太郎", h.name,"InvisibleHero.InvisibleHero(String, int)内でのnameの設定が不正です!");
    }

    @Test
    public void testConstructor4()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        InvisibleHero h = new InvisibleHero("生命太郎", 300, false);

        // undo the binding in System
        System.setOut(originalOut);

        // assertion
        assertEquals(300, h.hp,"InvisibleHero.InvisibleHero(String, int,boolean)内でのhpの設定が不正です!");
        assertEquals("生命太郎", h.name,"InvisibleHero.InvisibleHero(String, int,boolean)内でのnameの設定が不正です!");
        assertEquals(false, h.isVisible,"InvisibleHero.InvisibleHero(String, int,boolean)内でのisVisibleの設定が不正です!");
    }
}
