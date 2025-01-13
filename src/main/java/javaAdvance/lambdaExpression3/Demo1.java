package javaAdvance.lambdaExpression3;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
        //Function<T,R> --takes one argument as a paramater and returns a value
        //Ex1:
        Function<Integer,Integer> fn=i->(i*i);

//        Function<Integer,Integer> fn=(Integer i)->{
//            return i*i;
//        };
        int a=fn.apply(5);
        System.out.println("Square of 5::"+a);

        //Ex2:andThen()
        Function<Integer,Integer> multiplyByTwo=i->i*2;
        Function<Integer,Integer> addThree=i->i+3;

        //combined two functions using addThen()
        Function<Integer,Integer> combined=multiplyByTwo.andThen(addThree);
        System.out.println("Combined two functions::"+combined.apply(5));







    }
}
