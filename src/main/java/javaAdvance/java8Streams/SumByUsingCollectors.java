package javaAdvance.java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product2{
    int id;
    String name;
    float price;

    public Product2(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class SumByUsingCollectors {
    public static void main(String[] args) {
        List<Product2> productsList=new ArrayList<>();

        productsList.add(new Product2(1,"Hp laptop",25000f));
        productsList.add(new Product2(2,"Dell laptop",30000f));
        productsList.add(new Product2(3,"Lenovo laptop",28000f));
        productsList.add(new Product2(4,"Sony laptop",25000f));
        productsList.add(new Product2(5,"Apple laptop",900000f));
        productsList.add(new Product2(6,"Tuf laptop",35000f));

        double sum=productsList.stream()
                .collect(Collectors.summingDouble(p->p.price));
        System.out.println(sum);


    }
}
