package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class FilteringOperationsTest {
    @Test
    void testFilter() {
        List.of("Novin", "Ardian", "Yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .filter(names -> names.length() > 4)
                .forEach(System.out::println);

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9).stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        List.of("Novin", "ardian", "yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .filter(names -> Character.isUpperCase(names.charAt(0)))
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Novin", "Novin", "Ardian", "Yulianto", "Yulianto").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
