package PT1;

public class InternationalStudent extends Student {
    public String country;

    public InternationalStudent() {
        this.country = country;
        System.out.println("Sóc el constructor de la classe InternationalStudent");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
