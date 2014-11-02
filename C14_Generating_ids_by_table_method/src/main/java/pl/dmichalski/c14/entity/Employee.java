package pl.dmichalski.c14.entity;

import javax.persistence.*;

/**
 * Author: Daniel
 */
@Entity
public class Employee {

    @Id
    @TableGenerator(name = "myOwnGenerator",
            table = "table_with_ids",
            pkColumnName = "sequence_name",
            valueColumnName = "id_value",
            pkColumnValue = "id_pracownika",
            initialValue = 10,
            allocationSize = 15
    )
    @GeneratedValue(strategy = GenerationType.TABLE,
            generator = "myOwnGenerator")
    private Long id;

    private String name;

    private String surname;

    private double salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
