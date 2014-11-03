package pl.dmichalski.c19.entity;

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
}
