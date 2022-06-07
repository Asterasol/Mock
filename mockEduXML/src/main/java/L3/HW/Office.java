package L3.HW;

import L3.Other.Address;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement (localName = "office")
public class Office {
    @JacksonXmlElementWrapper(localName = "workers")
    @JacksonXmlProperty(localName = "worker")
    public List <Object> workers;
    @JacksonXmlProperty
    public Address address;

    public Office() {}

    public Office(List<Object> workers, Address address) {
        this.workers = workers;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Office{" +
                "address=" + address +
                ", workers=" + workers +
                '}';
    }
}
