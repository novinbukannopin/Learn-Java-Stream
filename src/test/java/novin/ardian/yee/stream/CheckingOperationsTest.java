package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class CheckingOperationsTest {

    @Test
    void testAnyMatch() {
        boolean anyMatch = List.of("Novin", "ardian", "yulianto", "budi", "Joko", "Yudi", "Otong").stream()
                .anyMatch(value -> Character.isUpperCase(value.charAt(0)));
        System.out.println(anyMatch);
    }

    @Test
    void testAllMatch() {
        boolean allMatch = List.of("Novin", "ardian", "yulianto", "budi", "Joko", "Yudi", "Otong").stream()
                .allMatch(value -> Character.isUpperCase(value.charAt(0)));
        System.out.println(allMatch);
    }

    @Test
    void testNoneMatch() {
        boolean noneMatch = List.of("novin", "ardian", "yulianto", "budi", "joko", "yudi", "otong").stream()
                .noneMatch(value -> Character.isUpperCase(value.charAt(0)));

        System.out.println(noneMatch);

    }
}
