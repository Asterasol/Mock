package L3.HW;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Worker {

    @JacksonXmlProperty
    public String firstName;
    public String lastName;
    public String parentName;
    public int age;
    public int experience;
    public int salary;
    public static int id;

    public Worker(String firstName, String lastName, String parentName, int age, int experience, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.parentName = parentName;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
    }

    public Worker () {}

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", parentName='" + parentName + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }
}
