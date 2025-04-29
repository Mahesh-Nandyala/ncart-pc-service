package com.ncart.pc.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PersonType implements Serializable {

    @JsonProperty("personId")
    private String personId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("age")
    private int age;
    @JsonProperty("maritalStatus")
    private String maritalStatus;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("occupation")
    private String occupation;
    @JsonProperty("dateOfBirth")
    private String dateOfBirth;
    @JsonProperty("addresses")
    private List<AddressType> addresses;
    @JsonProperty("phones")
    private List<PhoneType> phones;
    @JsonProperty("email")
    private EmailType email;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<AddressType> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressType> addresses) {
        this.addresses = addresses;
    }

    public List<PhoneType> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneType> phones) {
        this.phones = phones;
    }

    public EmailType getEmail() {
        return email;
    }

    public void setEmail(EmailType email) {
        this.email = email;
    }

    public PersonType() {
    }
}
