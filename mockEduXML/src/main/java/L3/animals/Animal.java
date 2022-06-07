package L3.animals;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement
public class Animal {

    @JacksonXmlProperty(isAttribute = true)
    public String type;
    @JacksonXmlProperty
    public String name;
    public int age;



    public Animal(){}

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        this.type = this.getClass().getSimpleName();
    }

    public boolean withTale;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", withTale=" + withTale +
                '}';
    }
}
