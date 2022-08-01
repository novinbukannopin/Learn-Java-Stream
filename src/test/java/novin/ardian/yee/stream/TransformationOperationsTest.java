package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class TransformationOperationsTest {

    @Test
    void testMap() {
        List.of("Novin", "Ardian", "Yulianto").stream()
                .map(name -> name.toUpperCase())
                .map(value -> value.length())
                .forEach(result -> System.out.println(result));
    }

    @Test
    void testFlatMap() {
        List.of("Novin", "Ardian", "Yulianto").stream()
                .map(name -> name.toUpperCase())
                .flatMap(result -> Stream.of(result, result.length()))
                .forEach(value -> System.out.println(value));

    }
}
