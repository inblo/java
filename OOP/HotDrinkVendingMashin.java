package OOP;

import java.util.List;

public class HotDrinkVendingMashin implements VendingMashine{
    private List<Product> productList;
    
    @Override
    public void initProduct(List<Product> productList){
        this.productList = productList;
    }
    @Override
    public Product getProduct(String name){
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;

    }

    public Product getProduct(String name, int volume, int temperature){
        for (Product product : productList) {
            if (product.getName().equals(name) && 
            ((HotDrink)product).getTemperature() == temperature) {
                return product;
            }
            else if (product.getName().equals(name) && 
            ((HotDrink)product).getVolume() == volume) {
                return product;
            }
         }
         return null;
    }
}
