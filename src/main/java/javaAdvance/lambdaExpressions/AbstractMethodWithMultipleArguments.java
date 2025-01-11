package javaAdvance.lambdaExpressions;

@FunctionalInterface
interface Cab2{
    public void bookCab(String source,String destination);
}
public class AbstractMethodWithMultipleArguments {
    public static void main(String[] args) {
        Cab2 cab2=(String source, String destination) ->{
            System.out.println("cab booked sucessfully from:"+source+"to:"+destination);
        };
        cab2.bookCab("hyd","banglore");

        Cab2 cab21=(source, destination) -> System.out.println("cab booked from:"+source+"to:"+destination);
        cab21.bookCab("chennai","banglore");
    }
}
