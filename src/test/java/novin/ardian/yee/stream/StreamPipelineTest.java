package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class StreamPipelineTest {

    @Test
    void testCreateStreamPipeline() {
//      ini jarang digunakan
        List<String> stringList = List.of("Novin", "Ardian", "Yulianto");
        Stream<String> stream = stringList.stream();
        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());
        Stream<String> streamMr = streamUpper.map(value -> "Mr. " + value);
        streamMr.forEach(System.out::println);
    }

    @Test
    void testCreateStreamPipelineOK() {
        List<String> stringList = List.of("Novin", "Ardian", "Yulianto");
        stringList.stream()
                .map(name -> name.toUpperCase())
                .map(name -> "Mr. " + name)
                .forEach(System.out::println);
    }
}
