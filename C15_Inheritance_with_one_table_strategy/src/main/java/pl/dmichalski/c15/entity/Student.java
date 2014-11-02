package pl.dmichalski.c15.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Author: Daniel
 */
@Entity
@DiscriminatorValue("STUDENT")
public class Student extends Person {

    private double averageGrade;

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
