package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Novin on 02/08/2022
 * @project Learn-Java-Stream
 */
public class GroupingByTest {
    @Test
    void testGroupingBy() {

//      test panjang huruf di nama
        List<String> names = List.of("Novin", "Ardian", "Yulianto", "El", "Nikmatul", "Izza");
        Map<String, List<String>> test = names.stream()
                .collect(Collectors.groupingBy(word -> word.length() > 4 ? "Panjang" : "Pendek"));
        System.out.println(test);
    }

    @Test
    void testGroupingBy2() {
        List<Integer> number = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String, List<Integer>> collect = number.stream()
                .collect(Collectors.groupingBy(value -> value > 5 ? "Besar" : "Kecil"));
        System.out.println(collect);
    }

    @Test
    void testPartitioningBy() {
        List<Integer> age = List.of(19, 20, 18, 22, 17, 33, 24, 26, 38);
        Map<Boolean, List<Integer>> result = age.stream()
                .collect(Collectors.partitioningBy(value -> value > 22 ? true : false));
        System.out.println(result);

    }
}
