import java.util.Objects;

public class Item {

    private double price;
    private String name;
    private double weight;
    private int count;
    private boolean isAvailable;

    public Item() {
    }

    public Item(double price, String name, double weight, int count, boolean isAvailable) {
        if (price <= 0){
            this.price = 1;
        }else{
            this.price = price;
        }
        this.name = name;
        this.weight = weight;
        this.count = count;
        this.isAvailable = isAvailable;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

//    private double price;
//    private String name;
//    private double weight;
//    private int count;
//    private boolean isAvailable;


    @Override
    public boolean equals(Object o) {
        if (o.getClass() == this.getClass()){
            Item temp = (Item) o;
            return temp.getPrice() == this.price && temp.getName().equals(this.name);
        }else{
            return false;
        }
    }


}
