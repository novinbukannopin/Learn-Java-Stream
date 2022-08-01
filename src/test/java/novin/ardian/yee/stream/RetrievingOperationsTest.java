package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class RetrievingOperationsTest {

    @Test
    void testLimit() {
        List.of("Novin", "ardian", "yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .limit(3)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Novin", "ardian", "yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .skip(3)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("eko", "Novin", "ardian", "yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
//      selama kondisinya true, akan di foreach, break ketika false
    }

    @Test
    void testDropWhile() {
        List.of("edo", "ardian", "yulianto", "Budi", "Joko", "adi", "Otong").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
//      akan meng eject kondisi yang false, dan continue
    }

    @Test
    public void testFindAny() {
        List.of("ardian", "yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .findAny()
                .ifPresent(System.out::println);

    }

    @Test
    void testFindFirst() {
        List.of("yulianto", "Budi", "Joko", "Yudi", "Otong").stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
