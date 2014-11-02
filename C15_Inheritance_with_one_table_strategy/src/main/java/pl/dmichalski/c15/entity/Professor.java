package pl.dmichalski.c15.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Author: Daniel
 */
@Entity
@DiscriminatorValue("PROFESSOR")
public class Professor extends Person {

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
