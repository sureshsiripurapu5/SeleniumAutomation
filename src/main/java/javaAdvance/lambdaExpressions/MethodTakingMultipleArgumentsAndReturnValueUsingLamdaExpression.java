package javaAdvance.lambdaExpressions;

@FunctionalInterface
interface Cab4{
    public String bookCab(String source,String destination);
}


public class MethodTakingMultipleArgumentsAndReturnValueUsingLamdaExpression {
    public static void main(String[] args) {
        Cab4 cab4=(source, destination) -> {
            System.out.println("cab booked from::"+source+"to:"+destination);
            return "price:5000";
        };
        String c=cab4.bookCab("hyd","mumbai");
        System.out.println(c);

    }
}
