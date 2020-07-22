package com.galvanize.endpoint_checkpoint;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Credit {
    private List<Person> person;
    @JsonProperty("Person")
    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }
}
