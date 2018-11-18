import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSumKTest {

    @Test
    public void findMaxSumEmptyTest() {
        int[] inputArray = {};
        int expected = 0;
        int actual = MaxSumK.findMaxSum(inputArray,2);

        assertEquals(expected,actual);
    }

    @Test
    public void findMaxSumPrimaryTest(){
        int[] inputArray = {1, 2, 10, 5, 3};
        int expected = 18;
        int actual = MaxSumK.findMaxSum(inputArray,3);

        assertEquals(expected,actual);
    }

    @Test
    public void findMaxSumTinyTest(){
        int[] inputArray = {1, 2};
        int expected = 0;
        int actual = MaxSumK.findMaxSum(inputArray,5);

        assertEquals(expected,actual);
    }

    @Test
    public void findMaxSumTinyYesTest(){
        int[] inputArray = {1, 2};
        int expected = 2;
        int actual = MaxSumK.findMaxSum(inputArray,1);

        assertEquals(expected,actual);
    }

    @Test
    public void findMaxSumBigYesTest(){
        int[] inputArray = {1, 2, 22, 11, 10, 3, 4, 7, 9};
        int expected = 46;
        int actual = MaxSumK.findMaxSum(inputArray,4);

        assertEquals(expected,actual);
    }
}