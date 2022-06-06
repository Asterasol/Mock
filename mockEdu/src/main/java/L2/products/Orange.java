package L2.products;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonTypeName;


@JsonTypeName("orange")
@JsonAutoDetect
public class Orange extends Product {
    public boolean withBone;
    public Orange() {
    }
    public Orange(String name, int price, int weight, boolean withBone) {
        super(name, price, weight);
        this.withBone = withBone;
    }


    @Override
    public String toString() {
        return "Orange{" +
                "withBone=" + withBone +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
