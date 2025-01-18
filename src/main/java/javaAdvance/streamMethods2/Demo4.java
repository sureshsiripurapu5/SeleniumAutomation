package javaAdvance.streamMethods2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        //concatanating streams

        List<String> firstNames= Arrays.asList("suresh","virat","yaswanth","harsha");
        List<String> lastNames=Arrays.asList("siripurapu","kohli","yarkareddy","vanga");

        Stream<String> stream1=firstNames.stream();
        Stream<String> stream2=lastNames.stream();

        List<String> finalList=Stream.concat(stream1,stream2).collect(Collectors.toList());

        for (String n:finalList){
            System.out.println(n);
        }
    }
}
