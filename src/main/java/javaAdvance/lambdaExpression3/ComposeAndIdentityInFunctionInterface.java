package javaAdvance.lambdaExpression3;

import java.util.function.Function;

public class ComposeAndIdentityInFunctionInterface {
    public static void main(String[] args) {

        //compose
        Function<Integer,Integer> multiplyByTwo=i->i*2;
        Function<Integer,Integer> addThree=i->i+3;

        //compose
        Function<Integer,Integer> combined=multiplyByTwo.compose(addThree);//first addThree then multuplyByTwo
        System.out.println("Combined using compose()::"+combined.apply(5));

        //identity
        Function<String,String> identityFunction=Function.identity();
        System.out.println(identityFunction.apply("Java"));


    }


}
