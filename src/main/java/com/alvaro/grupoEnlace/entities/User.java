package com.alvaro.grupoEnlace.entities;

/**
 * Created by armandosanchezmedina on 25/06/2017.
 */
public class User {

    private int id;
    private String type;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User (int id){
        this.id = id;
    }

}
