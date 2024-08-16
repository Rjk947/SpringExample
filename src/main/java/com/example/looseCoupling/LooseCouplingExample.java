package com.example.looseCoupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider userDataProvider = new UserDatabase();
        UserManager userManager = new UserManager(userDataProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider sqlDataProvider = new MySqlDatabaseProvider();
        UserManager userManagerFromSqlDb = new UserManager(sqlDataProvider);
        System.out.println(userManagerFromSqlDb.getUserInfo());

        UserDataProvider oracleDatabaseProvider = new OracleDatabaseProvider();
        UserManager userManagerFromOracleDb = new UserManager(oracleDatabaseProvider);
        System.out.println(userManagerFromOracleDb.getUserInfo());
    }
}
