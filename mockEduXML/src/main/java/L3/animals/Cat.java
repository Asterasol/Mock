package L3.animals;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement (localName = "Cat")
public class Cat extends Animal {

    @JacksonXmlProperty
    public String kind;

    public Cat () {}

    public Cat (String name, int age, String kind) {
        super(name, age);
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", withTale=" + withTale +
                ", kind='" + kind + '\'' +
                '}';
    }
}
