package javaAdvance.lambdaExpressions2;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        //Predicate takes one parameter and return a boolean
        //used only if we have conditional checks in the program
        //Ex1:
        Predicate<Integer> p=i->(i>10);

        boolean c=p.test(5);
        System.out.println(c);

        //Ex2: check the length of given string is greater than 4 or not.
        Predicate<String> p1=s->(s.length()>4);
        p1.test("sureshs");
        System.out.println(p1.test("sureshsiripurapu")); //true
        System.out.println(p1.test("sss"));//false

        //Ex3: print array elements whose size is >4 from array
        String[] arr={"suresh","ramesh","rakesh","james"};

        for(String i:arr){
            //System.out.println(p1.test(i));
            if(p1.test(i))
                System.out.println(i);
        }




    }
}
