package javaAdvance.lambdaExpressions;

@FunctionalInterface
interface Cab{
    public void bookCab();
}

class Ola implements Cab{

    @Override
    public void bookCab() {
        System.out.println("Ola cab is booked..");
    }
}


public class Test {
    public static void main(String[] args) {
        Cab cab=new Ola();
        cab.bookCab();
    }
}
