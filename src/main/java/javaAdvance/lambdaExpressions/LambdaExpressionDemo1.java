package javaAdvance.lambdaExpressions;

@FunctionalInterface
interface Cab1{
    public void bookCab();
}

public class LambdaExpressionDemo1 {
    public static void main(String[] args) {
        Cab cab=()-> {
            System.out.println("Ola cab is booked...");
        };
        cab.bookCab(); //this is one way to implement functional interface using braces


        Cab cab1=()-> System.out.println("Ola cab1 booked..."); //this is the clear concise way to implement functional interface.
        cab1.bookCab();
    }
}
