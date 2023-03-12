package hw2.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public Address(String suite, String street, String city, String zipcode, String lat, String lng) {
        this.suite = suite;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = new Geo(lat, lng);
    }
}
