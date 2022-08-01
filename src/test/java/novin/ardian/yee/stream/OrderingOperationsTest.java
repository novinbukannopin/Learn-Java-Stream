package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class OrderingOperationsTest {

    @Test
    void testSorted() {
        List.of("Novin", "Ardian", "Yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {

        Comparator<String> reverseOrder = Comparator.reverseOrder();
        List.of("Novin", "Ardian", "Yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .sorted(reverseOrder)
                .forEach(System.out::println);

    }
}
