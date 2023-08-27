public class Products {
    protected String name;
    protected String brand;
    protected double price;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    Products(){
        this("NoName");
    }
    Products(String name) {
        this(name, "NoBrand");
    }
    Products(String name, String brand){
        this(name, brand, 100);
    }
    Products(String name, String brand, double price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
}
