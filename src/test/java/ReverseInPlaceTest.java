import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReverseInPlaceTest {

    @Test
    public void reverseArrayInitialTest() {
        char[] original = {'C', 'L', 'A', 'S', 'S','I','C'};
        char[] expected = {'C', 'I', 'S', 'S','A','L','C'};
        char[] actual = ReverseInPlace.reverseArray(original);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void reverseArrayTinyTest() {
        char[] original = {'y', 'e', 's'};
        char[] expected = {'s','e','y'};
        char[] actual = ReverseInPlace.reverseArray(original);

        assertArrayEquals(expected,actual);
    }

    //not in scope of original problem domain
    @Test
    public void reverseArrayEmptyTest() {
        char[] original = {};
        char[] expected = {};
        char[] actual = ReverseInPlace.reverseArray(original);

        assertArrayEquals(expected,actual);
    }
}