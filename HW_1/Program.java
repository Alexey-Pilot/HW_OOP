import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate("Milk chocolate", "Nestle", 100, 100);
        Chocolate chocolate2 = new Chocolate("Dark chocolate", "Alpen Gold", 80, 90);
        Chocolate chocolate3 = new Chocolate("Milk chocolate with nuts", "Alionka", 50, 50);
        Chocolate chocolate4 = new Chocolate("Milk chocolate", "Alpen Gold", 80, 90);
        Chocolate chocolate5 = new Chocolate("Milk chocolate", "Milka", 100, 80);
        List<Products>chocolates = new ArrayList<>();
        chocolates.add(chocolate1);
        chocolates.add(chocolate2);
        chocolates.add(chocolate3);
        chocolates.add(chocolate4);
        chocolates.add(chocolate5);
        VendingMachine products = new VendingMachine(chocolates);
        Products founded = products.getChocolate("Milk chocolate", 80);
        if (founded != null){
            System.out.println(founded.displayInfo());
        }
        else {
            System.out.println("No such product, try again");
        }
    }


}
