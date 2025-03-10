package PT1_Herència.School;

public class Person {
    public String name;
    public String address;

    public Person() {
        this.name = name;
        this.address = address;
        System.out.println("Sóc el constructor de la classe Person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
