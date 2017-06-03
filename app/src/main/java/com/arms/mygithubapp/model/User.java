package com.arms.mygithubapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 52-511-01 on 31/3/2560.
 */

public class User {



    @SerializedName("name") //github api field
    private String name;
    private String login;
    @SerializedName("company")
    private String company;
    @SerializedName("location")
    private String place;
    @SerializedName("email")
    private String email;

    public User(String name, String login, String company, String place, String email) {
        this.name = name;
        this.login = login;
        this.company = company;
        this.place = place;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
