package com.example.challenge.IoC;

public class UserDatabase implements UserDataProvider {

    @Override
    public String getUserDetails() {

        return "User Details from database";
    }
}
