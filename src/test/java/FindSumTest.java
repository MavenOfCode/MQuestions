import org.junit.Test;

import static org.junit.Assert.*;

public class FindSumTest {

    @Test
    public void findSumOriginalTest() {
        int[] inputArray = {10, 30, 20, 50, 110, 40};
        boolean actual = FindSum.findSum(inputArray, 120);

        assertTrue(actual);
    }

    @Test
    public void findSumFalsieTest() {
        int[] inputArray = {10, 30, 20, 50, 110, 40};
        boolean actual = FindSum.findSum(inputArray, 77);

        assertFalse(actual);
    }

    //not within original problem domain
    @Test
    public void findSumEmptyTest() {
        int[] inputArray = {};
        boolean actual = FindSum.findSum(inputArray, 0);

        assertFalse(actual);
    }

    //not within original problem domain
    @Test
    public void findSumNegativesTest() {
        int[] inputArray = {-10,11,-44,22,-33,100};
        boolean actual = FindSum.findSum(inputArray, -77);

        assertTrue(actual);
    }
}