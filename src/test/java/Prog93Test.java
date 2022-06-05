import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import java.io.*;

public class Prog93Test {

    @Test
    public void testHelloWorld()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        StandardInputStream in = new StandardInputStream();
        System.setIn(in);

        // action
        // in.inputln("2"); // 標準入力をテストする場合
        // Hello.main(new String[]{"1", "2", "3"}); // 実行時引数をテストする場合
        Prog93.main(null);
        // undo the binding in System
        System.setOut(originalOut);
        
        // assertion
        String[] prints = bos.toString().split("\r\n|\n", -1);
        try {
            assertEquals("勇者??が誕生した！ HP:120, isVisible: true", prints[0]);
            assertEquals("勇者工太が誕生した！ HP:120, isVisible: true", prints[1]);
            assertEquals("勇者工太が誕生した！ HP:150, isVisible: true", prints[2]);
            assertEquals("勇者工太が誕生した！ HP:150, isVisible: false", prints[3]);
        } catch (ArrayIndexOutOfBoundsException excpt) {
            fail("Prog93.main()のprint出力が4行ではありません!");
        }
        assertEquals(5,prints.length,"改行数が5つ以上あります!"); // このif文に到達した時点で prints.lengthは5以上になっている
    }
}
