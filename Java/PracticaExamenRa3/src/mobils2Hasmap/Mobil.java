package mobils2Hasmap;

public class Mobil {
    private String marca;
    private String model;
    private String numero;

    public Mobil(String marca, String model, String numero) {
        this.marca = marca;
        this.model = model;
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Model: " + model + ", Número: " + numero;
    }
}
