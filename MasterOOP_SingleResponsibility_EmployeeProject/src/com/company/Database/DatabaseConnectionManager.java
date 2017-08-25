package com.company.Database;

public class DatabaseConnectionManager {

    public DatabaseConnectionManager getManagerInstance(){
        System.out.println("Getting Manager Instance from DCM...");
        return new DatabaseConnectionManager();
    }

    public void connect(){
        System.out.println("Connecting to database...");
    }

    public void getConnectionObject(){
        System.out.println("Retreiving Connection Object...");
    }

    public void disconnect(){
        System.out.println("Disconnecting from database...");
    }

}
