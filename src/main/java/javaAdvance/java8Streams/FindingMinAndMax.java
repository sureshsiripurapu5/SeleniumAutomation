package javaAdvance.java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Product3{
    int id;
    String name;
    float price;

    public Product3(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
public class FindingMinAndMax {
    public static void main(String[] args) {
        List<Product3> productsList=new ArrayList<>();

        productsList.add(new Product3(1,"Hp laptop",25000f));
        productsList.add(new Product3(2,"Dell laptop",30000f));
        productsList.add(new Product3(3,"Lenovo laptop",28000f));
        productsList.add(new Product3(4,"Sony laptop",25000f));
        productsList.add(new Product3(5,"Apple laptop",900000f));
        productsList.add(new Product3(6,"Tuf laptop",35000f));
       //finding max price from the list using max(comparator)
       Product3 productA= productsList.stream()
                .max((product1,product2)->product1.price>product2.price?1:-1).get();

        System.out.println(productA.price);

        //finding max price from the list using min(comparator)

        Product3 productB= productsList.stream()
                .min((product1,product2)->product1.price>product2.price?1:-1).get();

        System.out.println(productB.price);



    }
}
