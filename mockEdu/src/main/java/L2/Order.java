package L2;

import L2.HW.Address;
import L2.products.Product;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect
public class Order {
    public static int id;
    public List<Product> productList;
    public Address address;

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                ", address=" + address +
                '}';
    }

    public Order(List<Product> productList) {
        id++;
        this.productList = productList;
    }

    public Order(List<Product> productList, Address address) {
        id++;
        this.productList = productList;
        this.address = address;
    }
}
