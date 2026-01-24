package streamBasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter2 {
    static void main(String[] args) {

        List<String> rawData = Arrays.asList("Ritesh", "Raj", null, "deepak", "suraj", null);

        List<String> result =  rawData.stream().filter(str->str != null).collect(Collectors.toList());
        System.out.println(result);

        rawData.stream().filter(str->str !=null).forEach(str-> System.out.print(str + " "));

        rawData.stream().filter(str-> str != null).forEach(System.out::print);
    }
}
