package L1;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

@JsonAutoDetect
class Apple {
    public String variety;
    public int price;

    public Apple(){}

    @Override
    public String toString() {
        return "Apple variety is " + this.variety + " and him price " + this.price;
    }

    public static void main(String[] args) throws IOException
    {
        Apple apple = new Apple();
        apple.variety = "Green";
        apple.price = 100;


        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, apple);


        String result = writer.toString();
        System.out.println(result);


        StringReader reader = new StringReader(result);
        Apple appleNew = mapper.readValue(reader, Apple.class);


        System.out.println(appleNew.toString());
    }
}
