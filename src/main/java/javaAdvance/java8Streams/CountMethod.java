package javaAdvance.java8Streams;

import java.util.ArrayList;
import java.util.List;

class Product4{
    int id;
    String name;
    float price;

    public Product4(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class CountMethod {
    public static void main(String[] args) {
        List<Product4> productsList=new ArrayList<>();

        productsList.add(new Product4(1,"Hp laptop",25000f));
        productsList.add(new Product4(2,"Dell laptop",30000f));
        productsList.add(new Product4(3,"Lenovo laptop",28000f));
        productsList.add(new Product4(4,"Sony laptop",25000f));
        productsList.add(new Product4(5,"Apple laptop",900000f));
        productsList.add(new Product4(6,"Tuf laptop",35000f));

        long count=productsList.stream()
                .filter(p->p.price<30000)
                .count();

        System.out.println(count);

    }
}
