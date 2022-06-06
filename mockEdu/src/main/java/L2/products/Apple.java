package L2.products;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("apple")
@JsonAutoDetect
public class Apple extends Product {
    public String  color;
    public Apple() {
    }
    public Apple(String name, int price, int weight, String color) {
        super(name, price, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
