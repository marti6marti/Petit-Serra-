package ActivitatsSOLID.ex5;

public class SqlDatabase implements SaveDB {

    @Override
    public void saveIDdb(String empID) {
        System.out.println("The id: " + empID + " is saved in the Sql database.");
    }
}
