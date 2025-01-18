package javaAdvance.streamMethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {

        //sorted()
        List<Integer> numberList= Arrays.asList(4,3,2,1,5,6,7,9,10);

        List<Integer> sortedList=numberList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted list::"+sortedList);//ascending order

        List<Integer> descindingList=numberList.stream()
                .sorted(Comparator.reverseOrder()) //reverse order
                .collect(Collectors.toList());
        System.out.println("Descinding order::"+descindingList);

        //strings
        List<String> namesList=Arrays.asList("suresh","david","harsha","siva","arjun");
        //ascending order
        List<String> sortedNamesList=namesList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("sorted names::"+sortedNamesList);

        //reverseOrder
        List<String> reverseSortedNamesList=namesList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("reverse names::"+reverseSortedNamesList);






    }
}
