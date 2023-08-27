public class Chocolate extends Products{
    private int weight;
    public Chocolate(String name, String brand, double price, int weight){
        super(name, brand, price);
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String displayInfo(){
        return String.format("[Chocolate] Name: %s, Brand: %s, Price: %f, Weight: %d", name, brand, price, weight);
    }
}
