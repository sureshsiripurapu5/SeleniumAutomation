package javaAdvance.streamMethods;

import java.util.Arrays;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {

        //toArray()
        List<Integer> numberList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Object[] arr=numberList.stream()
                .toArray();

        for (Object i:arr){
            System.out.println(i);
        }
    }
}
