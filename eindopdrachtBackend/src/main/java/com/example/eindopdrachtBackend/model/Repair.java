package com.example.eindopdrachtBackend.model;

public class Repair {

    private Long id;
    private long customerNumber;
    private String firstName;
    private String lastName;
    private String emailAdresss;
    private Long phoneNumber;
    private String maintainceRequired;
    //upload function comes here??


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(long customerNumber) {
        this.customerNumber = customerNumber;
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

    public String getEmailAdresss() {
        return emailAdresss;
    }

    public void setEmailAdresss(String emailAdresss) {
        this.emailAdresss = emailAdresss;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMaintainceRequired() {
        return maintainceRequired;
    }

    public void setMaintainceRequired(String maintainceRequired) {
        this.maintainceRequired = maintainceRequired;
    }
}
