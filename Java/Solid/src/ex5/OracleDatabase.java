package   ex5;

class OracleDatabase implements SaveDB {

    @Override
    public void saveIDdb(String empID) {
        System.out.println("The id: " + empID + " is saved in the Oracle database.");
    }
}
