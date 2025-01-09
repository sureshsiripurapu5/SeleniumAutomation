package javaAdvance.java8Interfaces;

public class MyClass implements InterfacesWithDefaultAndStaticMethods {
    @Override
    public void showSomething() {
        System.out.println("overiding the do something method");
    }

    public  void show(){
        defaultMethod();
    }
}
