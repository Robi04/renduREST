package com.teammanager.gestionequipe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String firstName;
    private String lastName;
    private int Age;

    public Player(){}

    public Player(int id, String firstName, String lastName, int age) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
