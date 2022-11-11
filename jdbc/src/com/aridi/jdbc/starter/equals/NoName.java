package com.aridi.jdbc.starter.equals;

import java.util.Objects;

public class NoName {
    int id ;
    String name;
    String surname;

    public NoName(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoName noName = (NoName) o;
        return Objects.equals(surname, noName.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
