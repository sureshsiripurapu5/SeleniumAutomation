package javaAdvance.java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;

    public Product(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class StreamsDemoExample {
    public static void main(String[] args) {

        List<Product> productsList=new ArrayList<>();

        productsList.add(new Product(1,"Hp laptop",25000f));
        productsList.add(new Product(2,"Dell laptop",30000f));
        productsList.add(new Product(3,"Lenovo laptop",28000f));
        productsList.add(new Product(4,"Sony laptop",25000f));
        productsList.add(new Product(5,"Apple laptop",900000f));
        productsList.add(new Product(6,"Tuf laptop",35000f));

        List<Float> priceList=new ArrayList<>(); //adding laptop prices to the list

        priceList=productsList.stream()
                .filter(p->p.price>30000)
                .map(p->p.price)
                .collect(Collectors.toList());

        System.out.println(priceList);




    }
}
