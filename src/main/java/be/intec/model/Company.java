package be.intec.model;

public class Company {
    private int id;
    private String name;
    private String vat;
    private String address;
    private String city;

    public Company(String name, String vat, String address, String city) {
        this.name = name;
        this.vat = vat;
        this.address = address;
        this.city = city;
    }



    @Override
    public String toString() {
        return String.format("Company : Id = %d / Name = %s / Vat = %s / Address = %s / City = %s", id, name, vat, address, city);
    }

    public Company() {

    }

    public String getName() {
        return name;
    }

    public Company setName(String name) {
        this.name = name;
        return this;
    }

    public String getVat() {
        return vat;
    }

    public Company setVat(String vat) {
        this.vat = vat;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Company setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Company setCity(String city) {
        this.city = city;
        return this;
    }

    public int getId() {
        return id;
    }

    public Company setId(int id) {
        this.id = id;
        return this;
    }


}
