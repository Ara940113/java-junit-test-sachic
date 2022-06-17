
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SachicTest {

    private Sachic sachic = new Sachic();

    @Test
    public void addTest() {
        // given
        int a = 1;
        int b = 3;
        // when
        int result = a + b;
        // then
        assertEquals(result, sachic.add(1, 3));
    }

    @Test
    public void subTest() {
        // given
        int a = 3;
        int b = 1;
        // when
        int result = a - b;
        // then
        assertEquals(result, sachic.sub(3, 1));
    }

    @Test
    public void mulTest() {
        // given
        int a = 3;
        int b = 1;
        // when
        int result = a * b;
        // then
        assertEquals(result, sachic.mul(3, 1));
    }

    @Test
    public void divTest() {
        // given
        int a = 3;
        int b = 1;
        // when
        int result = a / b;
        // then
        assertEquals(result, sachic.div(3, 1));
    }
}
