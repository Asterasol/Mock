package L3.Task;

import L3.animals.Animal;
import L3.animals.Cat;
import L3.animals.Dog;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException
    {
        Animal animal = new Animal("Fox", 11);
        Cat cat = new Cat("Barsik", 3, "Vasya");
        Dog dog = new Dog("Fixik", 5, true);

        List<Animal> list = new ArrayList<>();
        list.add(animal);
        list.add(cat);
        list.add(dog);

        String prefixPath = "src/";
        String extensionOfFile = ".xml";


        ObjectMapper mapper = new XmlMapper();

        for (int i = 0; i < list.size(); i++) {
            StringWriter writer = new StringWriter();
            mapper.writeValue(writer, list.get(i));

            StringBuilder fileName = new StringBuilder(prefixPath + list.get(i).getClass().getSimpleName() + extensionOfFile);

            FileWriter fileWriter = new FileWriter(fileName.toString());
            fileWriter.write(writer.toString());
            fileWriter.close();

            FileReader fileReader = new FileReader(fileName.toString());
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            switch (list.get(i).getClass().getSimpleName()){
                case "Animal":
                    Animal animalNew = mapper.readValue(bufferedReader.readLine(), Animal.class);
                    System.out.println(animalNew.toString());
                    break;

                case "Cat":
                    Cat catNew = mapper.readValue(bufferedReader.readLine(), Cat.class);
                    System.out.println(catNew.toString());
                    break;

                case "Dog":
                    Dog dogNew = mapper.readValue(bufferedReader.readLine(), Dog.class);
                    System.out.println(dogNew.toString());
                    break;

            }
            bufferedReader.close();
            fileReader.close();
        }
    }
}
