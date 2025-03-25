package   ex5;

class Client {
    public static void main(String[] args) {

        SqlDatabase sql = new SqlDatabase();
        OracleDatabase orq = new OracleDatabase();

// First you choose what type of database you want to add the employment to.
        sql.saveIDdb("12312");
        orq.saveIDdb("2m2m2");

    }
}
