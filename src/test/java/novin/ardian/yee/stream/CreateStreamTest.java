package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });
        Stream<String> oneStream = Stream.of("Novin");
        oneStream.forEach(data -> {
            System.out.println(data);
        });
        Stream<String> emptyOrNotStream = Stream.ofNullable(null);
        emptyOrNotStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Novin", "Ardian", "Yulianto");
        arrayStream.forEach(System.out::println);
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6);
        intStream.forEach(System.out::println);
        String[] array = new String[]{"Novin", "Ardian", "Yulianto"};
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void createStreamFromCollection() {
        Collection<String> collections = List.of("Novin", "Ardian", "Yulianto");
        Stream<String> stringStream = collections.stream();
        stringStream.forEach(System.out::println);

    }

    @Test
    void testCreateInfinteStream() {
        Stream<String> stringStream = Stream.generate(() -> "Novin");
//        stringStream.forEach(System.out::println);
//        infinte looping novin

        Stream<Integer> integerStream = Stream.iterate(1, value -> value + 1);
//        integerStream.forEach(System.out::println);
//        infinte looping increament value
    }
}
