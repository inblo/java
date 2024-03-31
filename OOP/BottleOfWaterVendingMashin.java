package OOP;

import java.util.List;

public class BottleOfWaterVendingMashin implements VendingMashine {
    private List<Product> prductList;
    @Override
    public void initProduct(List<Product> productList) {
        this.prductList = productList;
    }
    @Override
    public Product getProduct(String name){
        for (Product product : prductList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;

    }

    public  Product getProduct(String name, int volume){
        for (Product product : prductList) {
            if (product.getName().equals(name) && 
            ((BottleOfWater)product).getVolume() == volume) {
                return product;
            }
        }
        return null;
    }
}
