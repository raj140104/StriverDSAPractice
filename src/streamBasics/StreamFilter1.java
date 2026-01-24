package streamBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter1 {
    static void main(String[] args) {

        List<String> names = Arrays.asList("Ritesh", "Ramesh", "Suresh", "Jia", "Ganeshay");
        List<String> longNames = new ArrayList<>();

        longNames = names.stream().filter(str -> str.length()>4 && str.length()<9).collect(Collectors.toList());
        System.out.println(longNames);
        names.stream().filter(str -> str.length()>4 && str.length()<9).forEach(System.out::print);

    }
}
