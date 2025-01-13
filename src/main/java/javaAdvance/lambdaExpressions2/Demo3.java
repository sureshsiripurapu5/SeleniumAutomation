package javaAdvance.lambdaExpressions2;

import java.util.function.Predicate;

//joining predicates - and , or, negate
public class Demo3 {
    public static void main(String[] args) {
        int[] a={5,15,20,25,30,35,40,45,50,55,60,65};

        Predicate<Integer> p=i->(i%2==0);
        Predicate<Integer> p1=i->(i>50);

        //and
        //following are numbers even & greater than 50
        for(int i:a){
            //if(p.test(i) &&p1.test(i))
            if(p.and(p1).test(i)){
                System.out.println(i);
            }
        }

        //or
        for(int i:a){
            //if(p.test(i) || p1.test(i))
            if(p.or(p1).test(i)){
                System.out.println(i);
            }
        }
         //negate-- true becomes false and vice versa
        for(int i:a){
            //if(p.test(i) || p1.test(i))
            if(p.negate().test(i)){
                System.out.println(i); //it will print odd becouse of negate()
            }
        }



    }
}
