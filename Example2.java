package JavaCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Fetching data as a List, Collectors example
public class Example2 {

    public static void main(String[] args) {

        List<Example1> productsList = new ArrayList<>();
        productsList.add(new Example1(1, "String1", 100));
        productsList.add(new Example1(2, "String2", 101));
        productsList.add(new Example1(3, "String3", 102));
        productsList.add(new Example1(4, "String1", 103));

        List<Float> productPriceList = productsList.stream()
                .map(x -> x.price) //fetching price
                .collect(Collectors.toList()); //collecting as list
        System.out.println(productPriceList);
    }
}
