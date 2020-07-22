package com.galvanize.endpoint_checkpoint;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private String role;
    private String FirstName;
    private String LastName;
    @JsonProperty("Role")
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @JsonProperty("FirstName")
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    @JsonProperty("LastName")
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
