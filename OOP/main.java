package OOP;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOfWater(863, "ewwe", 123));
        productList.add(new BottleOfWater(235, "eweer", 100));
        productList.add(new BottleOfWater(543, "ewwee", 150));
        productList.add(new BottleOfWater(194, "eweee", 24));
        BottleOfWaterVendingMashin vendingMashin = new BottleOfWaterVendingMashin();
        vendingMashin.initProduct(productList);
        productList.add(new HotDrink(211, "tea",125,89));
        productList.add(new HotDrink(250, "coffee", 100,70));
        HotDrinkVendingMashin vendingMashin2 = new HotDrinkVendingMashin();
        vendingMashin2.initProduct(productList);
        System.out.println(vendingMashin.getProduct("eweer", 100));
        System.out.println(vendingMashin2.getProduct("coffee", 100, 70));
    }
}
 