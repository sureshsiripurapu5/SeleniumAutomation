package javaAdvance.java8Interfaces;

public class MultipleInheritanceUsingJava8 implements InterfaceA,InterfaceB {


    @Override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
    }

    public static void main(String[] args) {
        MultipleInheritanceUsingJava8 multipleInheritanceUsingJava8=new MultipleInheritanceUsingJava8();
        multipleInheritanceUsingJava8.show();
    }
}
