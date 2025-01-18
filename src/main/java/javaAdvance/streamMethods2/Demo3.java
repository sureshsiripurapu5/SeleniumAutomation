package javaAdvance.streamMethods2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {

        //findAny() --it will find any element from the stream
        //FindFirst()--it will find the first element from the stream

        //findAny()
        List<String> names= Arrays.asList("suresh","raina","ramesh");
        Optional<String> ele=names.stream()
                .findAny();
        System.out.println(ele.get()); //suresh

        //if we give empty list then the exception occurs
//        List<String> names1=Arrays.asList();
//        Optional<String>ele1=names1.stream()
//                .findAny();
//        System.out.println(ele1.get());
        //Exception in thread "main" java.util.NoSuchElementException: No value present

        //findFirst()
        List<String> names3= Arrays.asList("suresh","ramesh","raina");

        Optional<String> ele2=names3.stream()
                .findFirst();

        System.out.println(ele2.get());  //suresh
    }
}
