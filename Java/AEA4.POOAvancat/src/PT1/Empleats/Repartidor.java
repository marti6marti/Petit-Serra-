package PT1.Empleats;

public class Repartidor extends Empleat{
    public String zona;
    public String producte;

    public Repartidor(String nom, String cognom, int edat, double salari, String zona, String producte) {
        super(nom, cognom, edat, salari);
        this.zona = zona;
        this.producte = producte;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getProducte() {
        return producte;
    }

    public void setProducte(String producte) {
        this.producte = producte;
    }
}
