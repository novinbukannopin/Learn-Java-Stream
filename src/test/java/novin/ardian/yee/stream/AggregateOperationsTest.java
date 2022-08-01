package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class AggregateOperationsTest {

    @Test
    void testMax() {
        List.of("Novin", "Ardian", "Yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("Novin", "Ardian", "Yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = List.of("Novin", "Ardian", "Yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .count();
        System.out.println(count);
    }

    @Test
    void testSum() {
        var result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (num, item) -> num + item);
        System.out.println(result);
    }

    @Test
    void testFactorial() {
        var result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, item) -> value * item);
        System.out.println(result);
    }
}
