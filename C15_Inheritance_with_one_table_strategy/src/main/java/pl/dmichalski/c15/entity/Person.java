package pl.dmichalski.c15.entity;


import javax.persistence.*;

/**
 * Author: Daniel
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "record_type")
public abstract class Person {

    @Id
    @GeneratedValue
    private long id;

    private String firstName;

    private String lastName;

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
}
