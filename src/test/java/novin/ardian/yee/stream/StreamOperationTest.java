package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class StreamOperationTest {

    @Test
    void testStreamOperations() {
        List<String> names = List.of("Novin", "Ardian", "Yulianto");
        Stream<String> stringStream = names.stream();
        Stream<String> upperStream = stringStream.map(name -> name.toUpperCase());
        upperStream.forEach(System.out::println);

        names.forEach(System.out::println);

    }
}
