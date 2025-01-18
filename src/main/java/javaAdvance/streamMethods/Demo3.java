package javaAdvance.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        //reduce() -- combines the objects into single object

        List<String> stringList= Arrays.asList("s","u","r","e","s","h","1","2","3");

        Optional<String> reduced =stringList.stream()
                .reduce((value,combinedValue)->{
                    return value+combinedValue;  //s+u+r+e+s+h+1+2+3
                });

        System.out.println(reduced.get());



    }
}
