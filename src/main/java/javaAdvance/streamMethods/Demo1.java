package javaAdvance.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {

        //distinct()--non-terminal removes the duplicates
        List<String> names= Arrays.asList("suresh","ramesh","suresh","kohli","rohit sharma");

       List<String> distinctElements= names.stream()
               .distinct()
               .collect(Collectors.toList());
        System.out.println(distinctElements);


        //we can use forEach() terminal method to print the data without collecting in other collection.
        List<String> playerNames=Arrays.asList("virat kohli","rohith sharma","kl rahul","bumrah","rohith sharma","kl rahul");

        playerNames.stream()
                .distinct()
                .forEach(name-> System.out.println(name));

        //count -- terminal method
        long count=playerNames.stream().distinct().count();
        System.out.println(count);

        //limit() -- non-terminal
        List<String> limitedPlayers=playerNames.stream().limit(3).collect(Collectors.toList());
        System.out.println("limited players::"+limitedPlayers);





    }
}
