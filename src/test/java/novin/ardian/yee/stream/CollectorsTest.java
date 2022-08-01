package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Novin on 02/08/2022
 * @project Learn-Java-Stream
 */
public class CollectorsTest {

    Stream<String> getStream() {
        return Stream.of("Novin", "Ardian", "Yulianto");
    }

    @Test
    void testCollections() {
        Set<String> stringSet = getStream().collect(Collectors.toSet());
        System.out.println(stringSet);
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);
        List<String> stringList = getStream().collect(Collectors.toList());
        System.out.println(stringList);
        List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
        System.out.println(immutableSet);
    }

    @Test
    void testMap() {
        Map<String, Integer> stringIntegerMap = getStream().collect(Collectors.toMap(
                name -> name,
                name -> name.length()
        ));
        System.out.println(stringIntegerMap);
    }
}
