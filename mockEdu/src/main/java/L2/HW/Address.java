package L2.HW;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Address {
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
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numberHouse=" + numberHouse +
                ", floor=" + floor +
                ", flat=" + flat +
                '}';
    }
}
