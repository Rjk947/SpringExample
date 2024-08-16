package com.example.looseCoupling;

import java.io.Serializable;

public class UserDatabase implements UserDataProvider {

    @Override
    public String getUserDetails() {

        return "User Details from database";
    }
}
