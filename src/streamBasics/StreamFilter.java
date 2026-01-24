package streamBasics;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String [] args){

        List<Integer> arrList = new ArrayList<>();
        arrList.add(12);
        arrList.add(9);
        arrList.add(98);

        System.out.println(arrList);
        Collections.sort(arrList);
        System.out.println(arrList);
        List<Integer> arrList1 = Arrays.asList(12,45, 1, 4, 24, 43);
        System.out.println(arrList1);
        System.out.println(arrList1);

    //without using the stream
        for(int num : arrList1){
            if(num%2==0){
                arrList.add(num);
            }
        }
        System.out.println(arrList);
    //using the stream
        arrList = arrList.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(arrList);
        arrList.stream().filter(n-> n%2==0).forEach(n-> System.out.print(n +" "));
    }
}
