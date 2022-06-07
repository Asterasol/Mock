package L3.HW;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HW1 {
    public static void main(String[] args) throws IOException {
        Worker worker = new Worker("Филиппова", "Анастасия", "Алексеевна", 31, 1, 50000);
        ObjectMapper mapper = new XmlMapper();
        FileWriter fileWriter = new FileWriter("src/Worker.xml");
        mapper.writeValue(fileWriter, worker);
        FileReader fileReader = new FileReader("src/Worker.xml");
        worker = mapper.readValue(fileReader, Worker.class);
        System.out.println(worker.toString());

    }
}
