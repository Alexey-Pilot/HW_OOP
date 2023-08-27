import java.util.List;

public class VendingMachine {
    private List<Products> products;
    public VendingMachine(List<Products>products){
        this.products = products;
    }
    public Products getChocolate(String name, int weight){
        for (Products product : products){
            if (product instanceof Chocolate){
                Chocolate chocolate = (Chocolate)product;
                if (chocolate.getName().equals(name) && chocolate.getWeight() == weight){
                    return chocolate;
                }
            }
        }
        return null;
    }
}
