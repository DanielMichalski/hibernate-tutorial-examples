package pl.dmichalski.c20.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Author: Daniel
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;

    private String firstName;

    private String lastName;

    private double salary;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    private List<Phone> phones;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", phones=").append(phones);
        sb.append('}');
        return sb.toString();
    }
}
