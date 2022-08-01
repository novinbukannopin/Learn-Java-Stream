package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Novin");
        builder.add("Ardian").add("Yulianto");

        Stream<String> stringStream = builder.build();
        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stringStream = Stream.builder().add("Novin").add("Ardian").add("Yulianto").build();
        stringStream.forEach(System.out::println);
    }
}
