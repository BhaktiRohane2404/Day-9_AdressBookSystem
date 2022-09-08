package com.AddressBookSystem;

public class ContactDetails {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    int phoneNumber;
    String emailId;

    ContactDetails(String firstName, String lastName, String address, String city, String state, int zip, int phoneNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "PersonInformation : \n" +
                " firstName = " + firstName + "\n" +
                " lastName = " + lastName + "\n" +
                " address =" + address + "\n" +
                " city =" + city + "\n" +
                " state =" + state + "\n" +
                " zip =" + zip + "\n" +
                " phoneNumber =" + phoneNumber + "\n" +
                " emailId =" + emailId
                ;
    }
}
