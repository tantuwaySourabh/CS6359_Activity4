
//reference : https://codegym.cc/groups/posts/191-unit-testing-in-java-with-junit


import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class AvgUTest {

    Average obj = new Average();
    int[] list = {5, 7, 4, 8, 6};

    @Test
    public void testGreaterk() {
        int output = obj.average(9,list);
        assertEquals(6, output);
    }
    @Test
    public void testLesserNonZerok() {
        int output = obj.average(4,list);
        assertEquals(6, output);
    }


    @Test
    public void testZerok() {
        int output = obj.average(0,list);
        assertEquals(0, output);
    }
    @Test
    public void testNegativek() {
        int output = obj.average(-20,list);
        assertEquals(0, output);
    }

    @Test
    public void testEmptyList() {
        int output = obj.average(20, new int[]{});
        assertEquals(0, output);
    }

    @Test
    public void testkMax() { // boundary test case
        int output = obj.average(Integer.MAX_VALUE, new int[]{});
        assertEquals(0, output);
    }

    @Test
    public void testkMin() {  //boundary test case
        int output = obj.average(Integer.MIN_VALUE, new int[]{});
        assertEquals(0, output);
    }
}
