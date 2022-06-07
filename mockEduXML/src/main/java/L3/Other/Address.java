package L3.Other;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Address {

    @JacksonXmlProperty
    public String country;
    public String city;
    public String street;
    public int numberHouse;
    public int floor;
    public int flat;

    public Address(){}

    public Address(String country, String city, String street, int numberHouse, int floor, int flat) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.numberHouse = numberHouse;
        this.floor = floor;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "L3.Other.Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numberHouse=" + numberHouse +
                ", floor=" + floor +
                ", flat=" + flat +
                '}';
    }
}
