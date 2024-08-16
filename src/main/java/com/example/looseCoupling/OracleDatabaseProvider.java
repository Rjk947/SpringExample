package com.example.looseCoupling;

public class OracleDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        return "Data From Oracle Database`";
    }
}
