package pl.dmichalski.c07.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Author: Daniel
 */
@Entity
public class Address {

    @Id
    @GeneratedValue
    private long id;

    private String locality;

    private String zipCode;

    private String street;

    private int streetNumber;

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("id=").append(id);
        sb.append(", locality='").append(locality).append('\'');
        sb.append(", zipCode='").append(zipCode).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", streetNumber=").append(streetNumber);
        sb.append('}');
        return sb.toString();
    }
}
