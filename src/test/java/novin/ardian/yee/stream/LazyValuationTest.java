package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class LazyValuationTest {

    @Test
    void testIntermediateOperations() {
        List<String> stringList = List.of("Novin", "Ardian", "Yulianto");
        Stream<String> stream = stringList.stream()
                .map(name -> {
                    System.out.println("Change " + name + "to UpperCase");
                    return name.toUpperCase();
                });

    }

    @Test
    void testTerminalOperations() {
        List<String> stringList = List.of("Novin", "Ardian", "Yulianto");
        stringList.stream()
                .map(value -> {
                    System.out.println("Change " + value + " to Uppercase");
                    return value.toUpperCase();
                })
                .map(upper -> {
                    System.out.println("Add " + upper + " Mr. ");
                    return "Mr. " + upper;
                })
                .forEach(name -> System.out.println(name));
    }
}
