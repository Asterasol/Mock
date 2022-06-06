package L2.task1;

import L2.Order;
import L2.products.Apple;
import L2.products.Orange;
import L2.products.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Apple apple = new Apple("Green apple", 300, 100, "green");
        Orange orange = new Orange("Juicy orange", 500, 100, false);
        List<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(orange);
        Order order = new Order(products);
        FileWriter fileWriter = new FileWriter("src/Order.json");
        mapper.writeValue(fileWriter, order);
        FileReader fileReader = new FileReader("src/order.json");
        order = mapper.readValue(fileReader, Order.class);
        System.out.println(order.toString());
    }
}
