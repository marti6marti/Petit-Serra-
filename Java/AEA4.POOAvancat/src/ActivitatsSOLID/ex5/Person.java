package ActivitatsSOLID.ex5;

public class Person {
    private SaveDB database;


    public Person(SaveDB database) {
        this.database = database;
    }


    public void saveID(String empID) {
        database.saveIDdb(empID);
    }

}