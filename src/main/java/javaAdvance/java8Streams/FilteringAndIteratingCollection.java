package javaAdvance.java8Streams;

import java.util.ArrayList;
import java.util.List;

class Product1{
    int id;
    String name;
    float price;

    public Product1(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

}
public class FilteringAndIteratingCollection {
    public static void main(String[] args) {
        List<Product1> productsList=new ArrayList<>();

        productsList.add(new Product1(1,"Hp laptop",25000f));
        productsList.add(new Product1(2,"Dell laptop",30000f));
        productsList.add(new Product1(3,"Lenovo laptop",28000f));
        productsList.add(new Product1(4,"Sony laptop",25000f));
        productsList.add(new Product1(5,"Apple laptop",900000f));
        productsList.add(new Product1(6,"Tuf laptop",35000f));

        productsList.stream()
                .filter(p->p.price>25000)
                .forEach(p->System.out.println(p.name));
                //.forEach(System.out::println);


    }
}
