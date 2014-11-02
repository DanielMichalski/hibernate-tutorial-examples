package pl.dmichalski.c17.entity;

import javax.persistence.Entity;

/**
 * Author: Daniel
 */
@Entity
public class Student extends Person {

    private double averageGrade;

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
