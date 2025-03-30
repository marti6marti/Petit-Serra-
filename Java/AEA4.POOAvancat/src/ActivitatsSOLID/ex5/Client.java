package ActivitatsSOLID.ex5;

class Client {
    public static void main(String[] args) {

        SaveDB sql = new SqlDatabase();
        SaveDB oracle = new OracleDatabase();


        Person person1 = new Person(sql);
        Person person2 = new Person(oracle);


        person1.saveID("12312");
        person2.saveID("2m2m2");

    }
}