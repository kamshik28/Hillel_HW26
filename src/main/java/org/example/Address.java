package org.example;

class Address {
    private String city;
    private String street;
    private String postalCode;

    public Address(String city, String street, String postalCode) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }
    @Override
    public String toString() {
        return street + ", " + city + ", " + postalCode;
    }
}
