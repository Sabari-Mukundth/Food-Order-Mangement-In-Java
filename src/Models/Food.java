package Models;

public class Food {
    private String Name;
    private long Quantity;
    private double price;

    public Food(String name, long quantity, double price) {
        Name = name;
        Quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getQuantity() {
        return Quantity;
    }

    public void setQuantity(long quantity) {
        Quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
