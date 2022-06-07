package L3.Other;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement
public class Nursery {

    @JacksonXmlProperty
    public String name;

    @JacksonXmlElementWrapper(localName = "animals")
    @JacksonXmlProperty(localName = "animal")
    public List<Object> animalList;

    @JacksonXmlProperty
    public Address address;

    public Nursery() {
    }

    public Nursery(String name, List<Object> animalList, Address address) {
        this.name = name;
        this.animalList = animalList;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nursery{" +
                "name='" + name + '\'' +
                ", animalList=" + animalList +
                ", address=" + address +
                '}';
    }


}
