package pl.dmichalski.c17.entity;

import javax.persistence.Entity;

/**
 * Author: Daniel
 */
@Entity
public class Professor extends Person {

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
