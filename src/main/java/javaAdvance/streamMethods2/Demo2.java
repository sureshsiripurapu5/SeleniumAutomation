package javaAdvance.streamMethods2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {

        //anyMatch()
        //allMatch()
        //noneMatch()

        Set<String> fruites= new HashSet<>();
        fruites.add("One apple");
        fruites.add("One mango");
        fruites.add("Two apples");
        fruites.add("More grapes");
        fruites.add("Two guavas");

        //anyMatch()
       boolean result= fruites.stream()
                .anyMatch(v->{ //predicate
                    return v.startsWith("One");
                });
        System.out.println(result); //true

        //allMatch()
       boolean result1= fruites.stream()
                .allMatch(v->{
                    return v.startsWith("One");
                });
        System.out.println(result1); //false

        //noneMatch()
        boolean result2= fruites.stream()
                .noneMatch(v->{
                    return v.startsWith("One");
                });
        System.out.println(result2); //false



    }
}
