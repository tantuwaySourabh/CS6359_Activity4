


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class AvgUTest {

    int[] list = {5,7,6,8,4};
    Average obj = new Average();

    @Test
    public void testOddAverageCase() {
        int variable1 = obj.average(3,list);
        assertEquals(2, variable1);
    }
    @Test
    public void testEvenAverageCase() {
        int variable1 = obj.average(4,list);
        assertEquals(2, variable1);
    }

    @Test
    public void testFalseCaseWithGreaterk() {
        int variable1 = obj.average(20,list);
        assertNotEquals(variable1, 2); // reason : (1+2+3+4+5+6+7+8+9+10)/10 = 5
    }
    @Test
    public void testTrueCaseWithGreaterk() {
        int variable1 = obj.average(20,list);
        assertEquals(variable1, 5); // reason : (1+2+3+4+5+6+7+8+9+10)/10 = 5
    }

    @Test
    public void testTrueCaseWithValueAsNegative() {
        int variable1 = obj.average(-1,list);
        assertEquals(variable1, 0); // reason : (0 / 0) = 0
    }


}
