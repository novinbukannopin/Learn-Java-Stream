package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class PrimitiveStreamTest {
    @Test
    void testCreate() {
        IntStream intStream = IntStream.range(1, 10);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.range(1, 3);
        DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(0.2).build();
        var result = doubleStream.reduce(0, (value, item) -> value + item);
        System.out.println(result);
    }

    @Test
    void testOperations() {
        IntStream intStream = IntStream.range(1, 10);
        intStream.average().ifPresent(System.out::println);

        IntStream.range(1, 10)
                .mapToObj(number -> "number = " + number)
                .forEach(System.out::println);
    }
}
