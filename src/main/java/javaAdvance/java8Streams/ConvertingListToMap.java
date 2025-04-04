package javaAdvance.java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product6{
    int id;
    String name;
    float price;

    public Product6(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class ConvertingListToMap {
    public static void main(String[] args) {

        List<Product6> productsList=new ArrayList<>();

        productsList.add(new Product6(1,"Hp laptop",25000f));
        productsList.add(new Product6(2,"Dell laptop",30000f));
        productsList.add(new Product6(3,"Lenovo laptop",28000f));
        productsList.add(new Product6(4,"Sony laptop",25000f));
        productsList.add(new Product6(5,"Apple laptop",900000f));
        productsList.add(new Product6(6,"Tuf laptop",35000f));
        productsList.add(new Product6(7,"Tuf laptop",88888));

        Map<Integer,String> priceList=productsList.stream()

                .collect(Collectors.toMap(p->p.id,p->p.name));
        System.out.println(priceList);

    }
}
