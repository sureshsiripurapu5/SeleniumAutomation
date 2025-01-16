package javaAdvance.java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product5{
    int id;
    String name;
    float price;

    public Product5(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class ConvertingListToSet {
    public static void main(String[] args) {
        List<Product5> productsList=new ArrayList<>();

        productsList.add(new Product5(1,"Hp laptop",25000f));
        productsList.add(new Product5(2,"Dell laptop",30000f));
        productsList.add(new Product5(3,"Lenovo laptop",28000f));
        productsList.add(new Product5(4,"Sony laptop",25000f));
        productsList.add(new Product5(5,"Apple laptop",900000f));
        productsList.add(new Product5(6,"Tuf laptop",35000f));

        Set<Float> priceList =productsList.stream()
                .filter(p->p.price<30000)
                .map(p->p.price)
                .collect(Collectors.toSet()); //removes duplicates

        System.out.println(priceList);


    }
}
