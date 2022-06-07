package L3.animals;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement (localName = "Dog")
public class Dog extends Animal {

    @JacksonXmlProperty
    public boolean isSmall;

    public Dog () {}

    public Dog (String name, int age, boolean isSmall) {
        super(name, age);
        this.isSmall = isSmall;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", withTale=" + withTale +
                ", isSmall='" + isSmall + '\'' +
                '}';
    }
}