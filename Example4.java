package JavaCollectors;

//Converting Data as a Set, Java collectors example

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example4 {

    public static void main(String[] args) {

        List<Example3> productsList = new ArrayList<>();
        productsList.add(new Example3(1, "String 1", 200f));
        productsList.add(new Example3(2, "String 2", 202f));
        productsList.add(new Example3(3, "String 3", 203f));

        Set<Float> productPriceList = productsList.stream()
                .map(x->x.price) //fetching price
                .collect(Collectors.toSet()); //collecting as list
        System.out.println(productPriceList);
    }
}
