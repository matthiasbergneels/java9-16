package de.mubn.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Examples {

    public static void main(String[] args) {

        System.out.println("Collection Framework factory methods:");
        demoCollectionFrameworkFactoryMethods();

        System.out.println("new Stream Methods:");
        demoNewStreamMethods();
    }

    private static void demoNewStreamMethods() {
        Stream.iterate("", s -> s.length() < 15 ? s + "s" : "s")
                .dropWhile(s -> s.length() < 5)
                .takeWhile(s -> s.length() < 10)
                .limit(30)
                .forEach(s -> System.out.println(s));
    }

    private static void demoCollectionFrameworkFactoryMethods() {
        List<String> list = List.of("one", "two", "three");
        Set<String> set = Set.of("one", "two", "three");
        Map<String, String> map = Map.of("foo", "one", "bar", "two");

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
