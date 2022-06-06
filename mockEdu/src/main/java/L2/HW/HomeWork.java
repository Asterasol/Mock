package L2.HW;

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
import java.util.Random;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        List <Order> ordersList = new ArrayList<>();
        int countOrders = 100;

        Product product = new Product("Potate", 150,1);
        Apple apple = new Apple("Green apple", 100, 2, "green");
        Orange orange = new Orange("Juicy orange", 109, 1, false);

        List<Product> listProducts = new ArrayList<>();
        listProducts.add(product);
        listProducts.add(apple);
        listProducts.add(orange);

        String [] countryes =  {"Russia", "USA", "Germany"};
        String [] cities = {"Moscow", "New York", "Berlin"};
        String [] streets = {"Arbat", "Wolk", "1th"};

        Random random = new Random();

        for (int i = 0; i < countOrders; i++){
            int house = (int) (Math.random() * 100);
            int floor = (int) (Math.random() * 10);
            int flat = (int) (Math.random() * 500);

            Order order = new Order(listProducts, new Address(countryes[random.nextInt(countryes.length)],
                                                                cities[random.nextInt(cities.length)],
                                                                streets[random.nextInt(streets.length)],
                                                                house,
                                                                floor,
                                                                flat));
            ordersList.add(order);
        }

        ObjectMapper mapper = new ObjectMapper();
        FileWriter fileWriter = new FileWriter("src/Orders.json");

        mapper.writeValue(fileWriter, ordersList);
        FileReader fileReader = new FileReader("src/Orders.json");
        ordersList = mapper.readValue(fileReader, List.class);
        System.out.println(ordersList.toString());

    }
}
