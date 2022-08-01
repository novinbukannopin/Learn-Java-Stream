package novin.ardian.yee.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Novin on 01/08/2022
 * @project Learn-Java-Stream
 */
public class ForEachOperationsTest {
    @Test
    void testPeekBefore() {
        List.of("Novin", "ardian", "yulianto", "budi", "Joko", "Yudi", "Otong").stream()
                .map(name -> {
                    System.out.println("Before change name to upper = " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change name to upper = " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println(name));

    }

    @Test
    void testPeekAfter() {
        List.of("Novin", "ardian", "yulianto", "budi", "Joko", "Yudi", "Otong").stream()
                .peek(name -> System.out.println("Before change name to upper = " + name))
                .map(String::toUpperCase)
                .peek(upper -> System.out.println("After change name to upper = " + upper))
                .forEach(name -> System.out.println("Final name = " + name));

    }
}
