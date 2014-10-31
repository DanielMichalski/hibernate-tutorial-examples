package pl.dmichalski.c12.entity;

import javax.persistence.*;

/**
 * Author: Daniel
 */
@Entity
public class Phone {

    @Id
    @GeneratedValue
    private long id;

    private String type;

    private String number;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Employee employee;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
