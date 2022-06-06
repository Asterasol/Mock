package L2.task1;


import L2.products.Apple;
import L2.products.Orange;
import L2.products.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException
    {
        Product product = new Product("productTomat", 150,1);
        Apple apple = new Apple("Green apple", 100, 2, "green");
        Orange orange = new Orange("Juicy orange", 109, 1, false);

        List<Product> list = new ArrayList<>();
        list.add(product);
        list.add(apple);
        list.add(orange);

        String prefixPath = "src/";
        String extensionOfFile = ".json";


        ObjectMapper mapper = new ObjectMapper();

        for (int i = 0; i < list.size(); i++) {
            StringWriter writer = new StringWriter();
            mapper.writeValue(writer, list.get(i)); // сериализация

            StringBuilder fileName = new StringBuilder(prefixPath + list.get(i).getClass().getSimpleName() + extensionOfFile); // имя файла

            FileWriter  fileWriter = new FileWriter(fileName.toString()); // создание файлов
            fileWriter.write(writer.toString());
            fileWriter.close();

            FileReader fileReader = new FileReader(fileName.toString());
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            switch (list.get(i).getClass().getSimpleName()){
                case "Apple":
                    Apple appleNew = mapper.readValue(bufferedReader.readLine(), Apple.class);
                    System.out.println(appleNew.toString());
                    break;

                case "Orange":
                    Orange orangeNew = mapper.readValue(bufferedReader.readLine(), Orange.class);
                    System.out.println(orangeNew.toString());
                    break;

                case "Product":
                    Product productNew = mapper.readValue(bufferedReader.readLine(), Product.class);
                    System.out.println(productNew.toString());
                    break;

            }
            bufferedReader.close();
            fileReader.close();

        }

    }
}
