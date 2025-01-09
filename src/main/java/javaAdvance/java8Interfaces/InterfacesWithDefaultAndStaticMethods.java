package javaAdvance.java8Interfaces;

public interface InterfacesWithDefaultAndStaticMethods {

    default void defaultMethod(){
        System.out.println("This is default method in the interface");
    }

    static void staticMethod(){
        System.out.println("This is a static method in the interface");
    }
    void showSomething();

}



