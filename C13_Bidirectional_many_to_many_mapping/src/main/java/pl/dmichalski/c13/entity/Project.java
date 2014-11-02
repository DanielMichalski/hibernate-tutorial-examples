package pl.dmichalski.c13.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Author: Daniel
 */
@Entity
public class Project {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "employees_x_projects",
            joinColumns = {@JoinColumn(name = "project_id")},
            inverseJoinColumns = {@JoinColumn(name = "employee_id")}
    )
    List<Employee> employees;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
