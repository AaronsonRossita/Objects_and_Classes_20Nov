import java.util.Objects;

public class Fruit {

    String name;
    double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Fruit() {
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() == this.getClass()){
            Fruit temp = (Fruit)o;
            return this.name.equals(temp.name) && this.price == temp.price;
            //     fruit1.name.equals(fruit2.name)
        }else{
            return false;
        }

//        Fruit temp = (Fruit)o;
//        return this.name.equals(temp.name) && this.price == temp.price;

//        if (this.name.equals(temp.name) && this.price == temp.price){
//            return true;
//        }else{
//            return false;
//        }

    }


}
