package com.saar.designPattern;

public final class CustomImmutableClass {
    private final String name;
    private final Integer id;
    private final Address address = new Address();
    public CustomImmutableClass(String name, Integer id, Address address) {
        this.name = name;
        this.id = id;
        setAddress(this.address,address);
    }

    private void setAddress(Address unshared, Address shared){
        unshared.setCity(shared.getCity());
        unshared.setCountry(shared.getCountry());
        unshared.setHouseNo(shared.getHouseNo());
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Address getAddress() {
       Address address = new Address();
       address.setHouseNo(this.address.getHouseNo());
       address.setCountry(this.address.getCountry());
       address.setCity(this.address.getCity());
       return address;
    }

    @Override
    public String toString() {
        return "CustomImmutableClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address.toString() +
                '}';
    }
}

class Address{
    private String city;
    private String country;
    Integer houseNo;

    public Address() {
    }

    public Address(String city, String country, Integer houseNo) {
        this.city = city;
        this.country = country;
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(Integer houseNo) {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", houseNo=" + houseNo +
                '}';
    }



    public static void main(String[] args) {
        Address address = new Address("kanpur","India",311);
        CustomImmutableClass customImmutableClass  = new CustomImmutableClass("shishir",1,address);
        customImmutableClass.getAddress().setCountry("pak");
        System.out.println("new obj "+customImmutableClass.toString());
        address.setCountry("pak");
        System.out.println("modify obj "+customImmutableClass.toString());


    }
}
