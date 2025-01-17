package javaAdvance.flatMapDemos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {

        //map()
        List<Integer> list1=Arrays.asList(1,2,3,4,5,6);

        List<Integer> list2=list1.stream().map(x->x+10).collect(Collectors.toList());
        System.out.println(list2);

        //flatMap()
        List<Integer> lst1=Arrays.asList(1,2);
        List<Integer> lst2=Arrays.asList(3,4);
        List<Integer> lst3= Arrays.asList(5,6);
        //adding three lists into single collection
        List<List<Integer>> combined=Arrays.asList(lst1,lst2,lst3);
//flatmap() returns the stream of objects
        //flatMap() will take the single collection and add into the stream
        List<Integer> finalResult=combined.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(finalResult);






    }
}
