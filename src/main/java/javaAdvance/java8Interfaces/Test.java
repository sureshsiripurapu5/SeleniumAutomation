package javaAdvance.java8Interfaces;

public class Test {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.show();
        InterfacesWithDefaultAndStaticMethods.staticMethod(); //we can call the static method by using the inetrface name
        obj.showSomething();
    }
}
