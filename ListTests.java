import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void filterTest(){
        List<String> test = new ArrayList<String>();
        test.add("vile");
        test.add("what");
        assertArrayEquals(test, filter(test, ));
    }
}
