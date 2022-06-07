package L3.Task;

import L3.Other.Address;
import L3.Other.Nursery;
import L3.animals.Cat;
import L3.animals.Dog;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new XmlMapper();
        Cat cat = new Cat("Murzik", 5, "Rijik");
        Dog dog = new Dog("Sharik", 1, true);

        List<Object> list = new ArrayList<>();
        list.add(cat);
        list.add(dog);

        Nursery nursery = new Nursery("Tales", list, new Address("Russia", "Moscow", "Arbat", 1, 3, 10 ));
        FileWriter fileWriter = new FileWriter("src/Nursery.xml");
        mapper.writeValue(fileWriter, nursery);
        FileReader fileReader = new FileReader("src/Nursery.xml");
        nursery = mapper.readValue(fileReader, Nursery.class);
        System.out.println(nursery.toString());
    }

}
