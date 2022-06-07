package L3.HW;

import L3.Other.Address;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW34 {
    public static void main(String[] args) throws IOException {
        List <Object> officesList = new ArrayList<>();
        int countOffices = 100;

        int countWorkers = 10;

        String [] firstName =  {"Ковальчук", "Прокопенко", "Полищук"};
        String [] lastName = {"Антон", "Сергей", "Георгий"};
        String [] parentName = {"Павлович", "Александрович", "Степанович"};

        String [] countryes =  {"Russia", "USA", "Germany"};
        String [] cities = {"Moscow", "New York", "Berlin"};
        String [] streets = {"Arbat", "Wolk", "1th"};

        Random random = new Random();

        for (int i = 0; i < countOffices; i++){
            List <Object> workersList = new ArrayList<>();
            for (int j = 0; j < countWorkers; j++) {
                int age = (int) (Math.random() * 40 + 18);
                int experience = (int) (Math.random() * 10);
                int salary = (int) (Math.random() * 100) * 1000;
                Worker worker = new Worker(firstName[random.nextInt(firstName.length)],
                        lastName[random.nextInt(lastName.length)],
                        parentName[random.nextInt(parentName.length)],
                        age,
                        experience,
                        salary);
                workersList.add(worker);
            }

            int house = (int) (Math.random() * 100);
            int floor = (int) (Math.random() * 10);
            int flat = (int) (Math.random() * 500);

            Office office = new Office(workersList, new Address(countryes[random.nextInt(countryes.length)],
                    cities[random.nextInt(cities.length)],
                    streets[random.nextInt(streets.length)],
                    house,
                    floor,
                    flat));
            officesList.add(office);
        }

        ObjectMapper mapper = new XmlMapper();
        FileWriter fileWriter = new FileWriter("src/Offices.xml");

        mapper.writeValue(fileWriter, officesList);
        FileReader fileReader = new FileReader("src/Offices.xml");
        officesList = mapper.readValue(fileReader, List.class);
        System.out.println(officesList.toString());

    }


}

