package com.example.looseCoupling;

public class MySqlDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "Data From MySQL Database";
    }
}
