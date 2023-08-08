package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testRightImplementation() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result = App.take(numbers, 2);
        assertEquals(Arrays.asList(1, 2), result);
    }

    @Test
    public void testWrongImplementation1() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result = App.take(numbers, 2);
        assertEquals(Arrays.asList(1, 2), result);
    }

    @Test
    public void testWrongImplementation2() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result = App.take(numbers, 2);
        assertEquals(Arrays.asList(1, 2), result);
    }

    @Test
    public void testWrongImplementation3() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result = App.take(numbers, 2);
        assertEquals(Arrays.asList(1, 2), result);
    }
}
