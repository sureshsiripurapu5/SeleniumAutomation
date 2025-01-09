package javaAdvance.java8Interfaces;

public interface InterfaceA {
    default void show(){
        System.out.println("Default method fromInterface A");
    }
}
