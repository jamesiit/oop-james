package uk.ac.westminster.productsapi.model;

public class Customer {

    private static int customerCount;
    private String tags[];
    private Long id;
    private String name;
    private String email;
    private Address address;

    public Customer(Long id, String name, String email, Address address, String[] tags) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.tags = tags;
        customerCount++;
    }

    public String[] getTags() {
        return tags;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    public Customer() {
        customerCount++;
    }

}
